object ResistorColorDuo {

    fun value(vararg colors: Color): Int {
        return "${Color.valueOf(colors.get(0).toString()).ordinal}${Color.valueOf(colors.get(1).toString()).ordinal}".toInt()
    }
}
