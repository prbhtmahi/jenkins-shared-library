def call(Map config = [:]) {
  loadLinuxScript(name: 'hello-world1.sh')
  sh "./hello-world1.sh ${config.name} ${config.dayOfWeek}"
}
