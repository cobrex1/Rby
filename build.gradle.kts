import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    java
    id("net.minecrell.plugin-yml.bukkit") version "0.3.0"
}

group = "net.piratjsk"
version = "2.2"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    jcenter()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("http://nexus.hc.to/content/repositories/pub_releases")
    maven("http://repo.citizensnpcs.co/")
    maven("http://repo.extendedclip.com/content/repositories/placeholderapi/")
    maven("http://maven.sk89q.com/repo/")
    maven("https://jitpack.io")
}

dependencies {
    compileOnly("org.bukkit:bukkit:1.13.2-R0.1-SNAPSHOT")
    compileOnly("net.milkbowl.vault:VaultAPI:1.7")
    compileOnly("net.citizensnpcs:citizensapi:2.0.24-SNAPSHOT")
    compileOnly("me.clip:placeholderapi:2.9.2")
    compileOnly("com.sk89q.worldedit:worldedit-bukkit:7.0.0-SNAPSHOT")
    compileOnly("com.sk89q.worldguard:worldguard-legacy:7.0.0-SNAPSHOT")
    compileOnly("com.github.mcMMO-Dev:mcMMO:203d3749ee")
}

bukkit {
    name = "Rby"
    authors = listOf("piratjsk", "elsiff")
    main = "net.piratjsk.rby.Rby"
    softDepend = listOf("Vault", "Citizens", "PlaceholderAPI", "mcMMO", "WorldGuard")
    apiVersion = "1.13"
    commands {
        register("rby") {
            aliases = listOf("morefish", "mf", "fish")
        }
    }
    permissions {
        register("rby.admin") {
            default = BukkitPluginDescription.Permission.Default.OP
        }
        register("rby.help") {
            default = BukkitPluginDescription.Permission.Default.TRUE
        }
        register("rby.top") {
            default = BukkitPluginDescription.Permission.Default.TRUE
        }
        register("rby.shop") {
            default = BukkitPluginDescription.Permission.Default.OP
        }
    }
}

val jar: Jar by tasks
jar.from("LICENSE")
