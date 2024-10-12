package PRAKTIK_DASAR_KOTLIN

fun main() {
    val winningBid = Bid(5000, "Kolektor Swasta")

    println("Item A terjual habis pada ${auctionPrice(winningBid, 2000)}.")
    println("Item B terjual habis pada ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}