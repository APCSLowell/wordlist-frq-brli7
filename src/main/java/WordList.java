import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int total = 0;
    for(int i = 0; i < myList.size(); i++) {
      if(myList.get(i).length() == len) {
        total++;
      }
    }
    return total;
  }

  public void removeWordsOfLength(int len)
  {
    for(int i = 0; i < myList.size(); i++) {
      if(myList.get(i).length() == len) {
        myList.remove(i);
        i--;
      }
    }

  }
}
