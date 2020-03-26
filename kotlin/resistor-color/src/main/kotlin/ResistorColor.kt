object ResistorColor {

    enum class Colors {
        black,
        brown,
        red,
        orange,
        yellow,
        green,
        blue,
        violet,
        grey,
        white
    }

    fun colorCode(input: String): Int {
        return Colors.valueOf(input).ordinal
    }

    fun colors(): List<String> {
        return Colors.values().map { it.name }
    }

}
