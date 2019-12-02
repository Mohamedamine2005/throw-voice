package tech.gdragon.data

import io.minio.MinioClient
import io.minio.ObjectStat
import mu.KotlinLogging
import org.apache.commons.io.FileUtils
import org.joda.time.DateTime
import org.koin.core.KoinComponent
import java.io.File

class DataStore : KoinComponent {
  val logger = KotlinLogging.logger { }

  private val accessKey: String? = getKoin().getProperty("DS_ACCESS_KEY")
  private val bucketName: String? = getKoin().getProperty("DS_BUCKET")
  private val endpoint: String? = getKoin().getProperty("DS_HOST")
  private val secretKey: String? = getKoin().getProperty("DS_SECRET_KEY")
  private val baseUrl: String = getKoin().getProperty("DS_BASEURL", "$endpoint/$bucketName")

  private val client: MinioClient = MinioClient(endpoint, accessKey, secretKey)

  init {
    require(client.bucketExists(bucketName)) {
      "$bucketName bucket does not exist!"
    }
  }

  fun upload(key: String, file: File): UploadResult {
    logger.info {
      "Ready to upload recording to - $baseUrl/$key"
    }

    client.putObject(bucketName, key, file.path, null, null, null, null)
    val stat = UploadResult.from(baseUrl, client.statObject(bucketName, key))

    logger.info {
      "Finished uploading file - (${FileUtils.byteCountToDisplaySize(stat.size)}) ${stat.key}"
    }

    return stat
  }
}

data class UploadResult(val key: String, val timestamp: DateTime, val size: Long, val url: String) {
  companion object {
    fun from(baseUrl: String, stat: ObjectStat) = UploadResult(stat.name(), DateTime(stat.createdTime()), stat.length(), "$baseUrl/${stat.name()}")
  }
}
