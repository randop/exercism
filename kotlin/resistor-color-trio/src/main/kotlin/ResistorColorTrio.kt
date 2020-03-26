object ResistorColorTrio {

    fun text(vararg input: Color): String {
        var value = "${Color.valueOf(input.get(0).toString()).ordinal}${Color.valueOf(input.get(1).toString()).ordinal}${"".padEnd(Color.valueOf(input.get(2).toString()).ordinal, '0')}".toInt()
        val thresh = 1000
        if (value < thresh) {
            return "$value ${Unit.values()[0].name.toLowerCase()}"
        }
        var u = -1
        do {
            value /= thresh
            ++u
        } while (value >= thresh && u < Unit.values().size - 1)
        return "$value ${Unit.values()[u+1].name.toLowerCase()}"
    }
}
