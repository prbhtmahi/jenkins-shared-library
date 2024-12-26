def call(Map config = [:]) {
 def scriptcontents = libraryResource "com/mahi/scripts/linus/${config.name}"
  writeFile file = "${config.name}", text:scriptcontents
  sh "chmod a+x /.${config.name}
}
