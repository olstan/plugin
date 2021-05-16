rootProject.name = "ben93riggs Plugins"

include(":autothiever")
include(":ardyironpowerminer")
include(":cannonreloader")
include(":continueclicker")
include(":eventdebugger")
include(":foodeater")
//include(":hydraautoprayer")
include(":itemcombiner")
include(":itemuser")
include(":jadautoprayer")
include(":lavacrafter")
include(":nightmarehelper")
include(":nmzhelper")
//include(":npcflicker")
include(":pktools")
include(":praypotdrinker")
include(":specialattackuser")

for (project in rootProject.children) {
    project.apply {
        projectDir = file(name)
        buildFileName = "${name.toLowerCase()}.gradle.kts"

        require(projectDir.isDirectory) { "Project '${project.path} must have a $projectDir directory" }
        require(buildFile.isFile) { "Project '${project.path} must have a $buildFile build script" }
    }
}