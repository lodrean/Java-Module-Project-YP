public class Formatting {


    static String round(double ruble){
        return String.format("%.2f", ruble);
    }
    public static String declination(double rubles){
        var deci = (int) rubles % 100 / 10;
            if (deci == 1)
            {
                return "рублей";
            }
        return switch ((int) rubles % 10) {
            case 1 -> "рубль";
            case 2, 3, 4 -> "рубля";
            default -> "рублей";
        };
        }
    }
