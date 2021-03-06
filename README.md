# pawa
> A voice channel recording bot for Discord.

<div align="center">
  <a href="https://discordbots.org/bot/338897906524225538">
    <img src="https://discordbots.org/api/widget/338897906524225538.png" alt="Discord Bots" />
  </a>
</div>

[![Discord](https://discordapp.com/api/guilds/408795211901173762/widget.png)](https://discord.gg/gkvsNw8)
[![pipeline status](https://gitlab.com/pawabot/pawa/badges/master/pipeline.svg)](https://gitlab.com/pawabot/pawa/commits/master)
[![codecov](https://codecov.io/gl/pawabot/pawa/branch/master/graph/badge.svg)](https://codecov.io/gl/pawabot/pawa)
[![Get your own version badge on microbadger.com](https://images.microbadger.com/badges/version/gdragon/throw-voice.svg)](https://microbadger.com/images/gdragon/throw-voice)
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgitlab.com%2Fpawabot%2Fpawa.svg?type=shield)](https://app.fossa.io/projects/git%2Bgitlab.com%2Fpawabot%2Fpawa?ref=badge_shield)

<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
# Contents

- [Commands](#commands)
- [Self-hosting](#self-hosting)
- [Attributions](#attributions)
- [License](#license)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

## Commands

|                            Command                            |                                                                  Description                                                                    |
|:--------------------------------------------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------|
| `!alias [command name] [new command alias]`                   | Creates an alias, or alternate name, to a command for customization.                                                                            |
| `!autorecord [Voice Channel name \| 'all'] [number \| 'off']` | Sets the number of players for the bot to autorecord a voice channel, or disables autorecord-ing. 'all' will apply number to all voice channels.|
| `!autostop [Voice Channel name \| 'all'] [number]`            | Sets the number of players for the bot to autostop a voice channel, or disables autostop-ing. 'all' will apply number to all voice channels.    |
| `!autosave`                                                   | Toggles the option to automatically save and send all files at the end of each session - not just saved or clipped files                        |
| `!clip [seconds] \| !clip [seconds] [text channel]`           | Saves a clip of the specified length and outputs it in the current or specified text channel (max 120 seconds)                                  |
| `!record`                                                     | Ask the bot to record your current channel                                                                                             |
| `!stop`                                                       | Ask the bot to stop recording it's current channel                                                                                                       |
| `!prefix [character]`                                         | Sets the prefix for each command to avoid conflict with other bots _(Default is '!')_                                                           |
| `!removeAlias [alias name]`                                   | Removes an alias from a command.                                                                                                                |
| `!save \| !save [text channel]`                               | Saves the current recording and outputs it to the current or specified text chats (caps at 16MB)                                                |
| `!saveLocation \| !saveLocation [text channel \| 'off']`      | Sets the text channel to send all messages to, use `off` to restore default behaviour.                                                          |
| `!volume [1-100]`                                             | Sets the percentage volume to record at, from 1-100%                                                                                            |

_Replace brackets [] with item specified. Vertical bar | means 'or', either side of bar is valid choice._

## Self-hosting

Self-hosting instructions got a lot more complex, see the [self-hosting](./docs/self-hosting.md) section for more on how
you can deploy the bot.

## Attributions

- "Dragon" by [lastspark](https://thenounproject.com/lastspark) from [the Noun Project](http://thenounproject.com/).
- Original Java codebase by [ajm1996's](https://github.com/ajm1996) [DiscordEcho](https://github.com/ajm1996/DiscordEcho).

## License

```
Copyright (c) 2017-2019 Guacamole Dragon, LLC

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgitlab.com%2Fpawabot%2Fpawa.svg?type=large)](https://app.fossa.io/projects/git%2Bgitlab.com%2Fpawabot%2Fpawa?ref=badge_large)
