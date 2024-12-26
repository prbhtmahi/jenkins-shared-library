def call(Map config = [:]) {
 sh 'echo inside loadLinuxScript function'
 def scriptcontents = libraryResource "com/mahi/scripts/linux/${config.name}"
  writeFile file: "${config.name}", text: scriptcontents
  sh "chmod a+x ./${config.name}"
}
