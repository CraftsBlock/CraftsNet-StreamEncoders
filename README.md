# CraftsNet-StreamEncoders
### Additionaly stream encoders for [CraftsNet](https://github.com/CraftsBlock/CraftsNet)

![Latest Release on Maven](https://repo.craftsblock.de/api/badge/latest/releases/de/craftsblock/craftsnet/modules/streamencoders?color=40c14a&name=StreamEncoders&prefix=v)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/CraftsBlock/CraftsNet-StreamEncoders)
![GitHub](https://img.shields.io/github/license/CraftsBlock/CraftsNet-StreamEncoders)
![GitHub all releases](https://img.shields.io/github/downloads/CraftsBlock/CraftsNet-StreamEncoders/total)
![GitHub issues](https://img.shields.io/github/issues-raw/CraftsBlock/CraftsNet-StreamEncoders)

---

This addon was created to supply more advanced stream encoders to the CraftsNet framework. The following stream encoders are currently supported:
- ZStandard
- Brotli

## Installation

### Addon File

Download the latest [release](https://github.com/CraftsBlock/CraftsNet-StreamEncoders/releases) and put the jar file in your addon folder of your CraftsNet Application.

### Maven
```xml
<repositories>
  ...
  <repository>
    <id>craftsblock-releases</id>
    <name>CraftsBlock Repositories</name>
    <url>https://repo.craftsblock.de/releases</url>
  </repository>
</repositories>
```
```xml
<dependencies>
  ...
  <dependency>
    <groupId>de.craftsblock.craftsnet.modules</groupId>
    <artifactId>streamencoders</artifactId>
    <version>VERSION</version>
  </dependency>
</dependencies>
```

### Gradle
```gradle
repositories {
  ...
  maven { url "https://repo.craftsblock.de/releases" }
  mavenCentral()
}
```
```gradle
dependencies {
  ...
  implementation "de.craftsblock.craftsnet.modules:streamencoders:VERSION"
}
```

## Loading

> [!Note]
> Only required if you are using the install method [Maven](https://github.com/CraftsBlock/CraftsNet-StreamEncoders/blob/master/README.md#maven) or [Gradle](https://github.com/CraftsBlock/CraftsNet-StreamEncoders/blob/master/README.md#gradle). You are also required to export your jar as a [thin / fat jar](https://stackoverflow.com/a/57592130)!

### Using the AddonContainingBuilder
```java
package de.craftsblock.myaddon;

import de.craftsblock.cnet.modules.encoders.StreamEncoders;
import de.craftsblock.craftsnet.CraftsNet;
import de.craftsblock.craftsnet.addon.Addon;
import de.craftsblock.craftsnet.addon.meta.annotations.Depends;
import de.craftsblock.craftsnet.addon.meta.annotations.Meta;

import java.io.IOException;

@Meta(name = "MyAddon")
@Depends(StreamEncoders.class) // Depend the stream encoders addon
public class MyAddon extends Addon {

    public static void main(String[] args) throws IOException {
        CraftsNet.create(MyAddon.class).withArgs(args).build(); // Starting CraftsNet + loading your addon
    }

}

```

## Open Source Licenses
We are using some third party open source libraries. Below you find a list of all third party open source libraries used:
| Name                                                                   | Description                                                                                                                           | Licecnse                                                                                         |
| ---------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------ |
| [CraftsNet](https://github.com/CrAfTsArMy/CraftsCore)                  | Easy creation of HTTP routes and WebSocket endpoints in Java.                                                                         | [Apache License 2.0](https://github.com/CraftsBlock/CraftsNet/blob/master/LICENSE)               |
| [CraftsCore](https://github.com/CrAfTsArMy/CraftsCore)                 | https://repo.craftsblock.de/#/releases/de/craftsblock/craftscore/CraftsCore                                                           | [Apache License 2.0](https://github.com/CrAfTsArMy/CraftsCore/blob/master/LICENSE)               |
| [JVM-Brotli](https://github.com/nixxcode/jvm-brotli)                   | Lightweight, cross-platform Java library for the Brotli compression format                                                            | [Apache License 2.0](https://github.com/nixxcode/jvm-brotli?tab=readme-ov-file#licensing)        |
| [zstd-jni](https://github.com/luben/zstd-jni)                          | JNI binding for Zstd                                                                                                                  | [BSD 2-Clause "Simplified" License](https://github.com/luben/zstd-jni/blob/master/LICENSE)       |

