import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    java
    id("net.minecrell.plugin-yml.bukkit") version "0.3.0"
}

group = "me.elsiff"
version = "2.2-SNAPSHOT"

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
    compileOnly("org.bukkit:bukkit:1.13-R0.1-SNAPSHOT")
    compileOnly("net.milkbowl.vault:VaultAPI:1.6")
    compileOnly("net.citizensnpcs:citizensapi:2.0.18-SNAPSHOT")
    compileOnly("me.clip:placeholderapi:2.7.1")
    compileOnly("com.sk89q:worldguard:6.1")
    compileOnly("com.github.mcMMO-Dev:mcMMO:fa1bbd2")
}

bukkit {
    name = "MoreFish"
    author = "elsiff"
    website = "http://elsiff.me"
    main = "me.elsiff.morefish.MoreFish"
    softDepend = listOf("Vault", "Citizens", "PlaceholderAPI", "mcMMO", "WorldGuard")
    apiVersion = "1.13"
    commands {
        register("morefish") {
            description = "Main command for MoreFish."
            usage = "/morefish"
            aliases = listOf("mf", "fish")
        }
    }
    permissions {
        register("morefish.admin") {
            default = BukkitPluginDescription.Permission.Default.OP
            description = "Give user ability to control the fishing contest."
        }
        register("morefish.help") {
            default = BukkitPluginDescription.Permission.Default.TRUE
            description = "Player with this permission can use the help command."
        }
        register("morefish.top") {
            default = BukkitPluginDescription.Permission.Default.TRUE
            description = "Player with this permission can use /morefish top command."
        }
        register("morefish.shop") {
            default = BukkitPluginDescription.Permission.Default.OP
            description = "Player with this permission can use /morefish shop command."
        }
    }
}
