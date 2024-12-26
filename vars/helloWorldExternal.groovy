def call(Map config = [:]) {
  sh 'echo execute loadLinuxScript function'
  loadLinuxScript(name: 'hello-world.sh')
  sh "./hello-world.sh ${config.name} ${config.dayOfweek}"
}
