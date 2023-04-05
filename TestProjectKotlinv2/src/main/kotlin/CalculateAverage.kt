import java.io.File

fun calculateAverage(numbers: IntArray): Double { //numbers = Parameter = Array von ganzZahlen, gibt Double zurück
    val sum = numbers.sum() // sum = variable, wird auf numbers aray gesetz
    return sum.toDouble() / numbers.size //Gibt ergebnis, indem die Summe aller Zahlen im Array durch anzahl Zahlen.
                                        // Summe ist integer deswegen zu double berechnen
}


fun findWords(filename: String): List<String> { //Dateiname als Eingabe. Gibt Liste von String zurück
    val wordCount = mutableMapOf<String, Int>() //Zählt jedes Word in der Datei

    File(filename).forEachLine { line -> //Ruft das File auf und liest jede Zeile
        line.split("\\s+".toRegex()).forEach { word -> //Mit Split Zeile in Wörtern aufteilen. ToRegex um Lehrzeichen als Trennung zwischen Wörtern
                                                        // Ergebnis von Split ist Array von Wörtern. Lauft dann mit foreach methode durch
                                                        //
            val count = wordCount.getOrDefault(word, 0) // mit getOrDefault wird der Wert des Wortes abgerufen. Wenn kein Wort
                                                                    // wird 0 zurückgegeben. Dann um 1 erhöht und im wordCount gespeichert
            wordCount[word] = count + 1
        }
    }
    val maxCount = wordCount.values.maxOrNull() //Höchste Zählerwert in WordCount wird in maxCount gespeichert
    return wordCount.filterValues { it == maxCount }.keys.toList() // mit filter alles in wordCount filtern, welches Wort most
                                                                    //  Wörter kommen in String Liste und werden zurückgegeben
}