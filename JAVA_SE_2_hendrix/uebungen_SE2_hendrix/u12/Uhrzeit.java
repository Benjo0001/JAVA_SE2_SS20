/**
 * UhrZeit
 * Entwerfen Sie eine finale Klasse UhrZeit, die eine statische Methode entspricht bereitstellt, um zwei Zeitangaben (Typ Zeit) zu vergleichen.
 */

final class Uhrzeit {

    static boolean entspricht(Zeit t1, Zeit t2){
      return  ((t1.getStunde() == t2.getStunde()) && (t2.getMinute() == t2.getMinute()));
    }

}