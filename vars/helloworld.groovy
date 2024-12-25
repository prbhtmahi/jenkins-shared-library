def call(String name, String dayOfWeek) {
    sh "echo hello from mahi to '$(name)'. Today is '$(dayOfWeek)'."
}
