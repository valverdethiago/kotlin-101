package challenges.topclients

data class Client(val id: String, val name: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Client

        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}
