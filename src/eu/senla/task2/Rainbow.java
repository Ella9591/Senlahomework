package eu.senla.task2;

public class Rainbow {
    /*
  private Color getColorByValue(int value) {
      Color color = Color.PINK;
      switch (value) {
          case 0:
              color = Color.PINK; break;
          case 1:
              color = Color.GREEN; break;
          case 2:
              color = Color.BLUE; break;
          case 3:
              color = Color.GRAY; break;
          case 4:
              color = Color.AQUA; break;
          case 5:
              color = Color.AQUAMARINE; break;
          case 6:
              color = Color.LEMONCHIFFON; break;
          case 7:
              color = Color.GREENYELLOW; break;
          case 8:
              color = Color.SILVER; break;
          case 9:
              color = Color.ORANGE; break;
          case 10:
              color = Color.OLIVE; break;
          case 11:
              color = Color.HONEYDEW; break;                         ----почему то выдвает ошибку

      }
      return color;
  }

    private void setCellColoredNumber(int value) {
        Color color = getColorByValue(value);
        if (value != 0) setCellValueEx(color, String.valueOf(value));
        else setCellValueEx(color, "");
    }

//for (int i = 0; i<newColours.length; i++){
     //   System.out.println(newColours[i]);

    //}


     */

    private static final String AQUAMARINE = "AQUAMARINE";
    private static final String LEMONCHIFFON = "LEMONCHIFFON";
    private static final String AQUA = "AQUA";
    private static final String GRAY = "GRAY";
    private static final String DARKBLUE = "DARKBLUE";
    private static final String VIOLET = "VIOLET";
    private static final String PINK = "PINK";

    public static void Rain(int a) {
        switch (a) {
            case 1:
                System.out.println(AQUAMARINE); break;
            case 2:
                System.out.println(LEMONCHIFFON); break;
            case 3:
                System.out.println(AQUA); break;
            case 4:
                System.out.println(GRAY); break;
            case 5:
                System.out.println(DARKBLUE); break;
            case 6:
                System.out.println(VIOLET); break;
            case 7:
                System.out.println(PINK); break;

        }
    }

    public static void Rain(int a, int b) {
        Rain(a);
        System.out.print("-");
        Rain(b);
    }

    public static void Print() {
        System.out.println("Выбирите желаемый цвет радуги:"); System.out.println("AQUAMARINE- 1.");
        System.out.println("LEMONCHIFFON - 2."); System.out.println("AQUA - 3.");
        System.out.println("GRAY - 4."); System.out.println("DARKBLUE - 5.");
        System.out.println("VIOLET - 6.");
        System.out.println("PINK - 7.");
    }

}
