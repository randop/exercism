internal fun twofer(name: String? = null): String {
    val you: String = when(name) {
        null -> "you"
        else -> name
    }
    return "One for $you, one for me."
}
