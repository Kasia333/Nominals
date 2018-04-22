public class Nominals {

    public void returnNominals(double input) {
        double[] nominals = {200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

        for (int i = 0; i < nominals.length; i++) {
            if ((input / nominals[i]) > 1) {
                int amount = (int)(input / nominals[i]);
                input -= nominals[i] * amount;
                System.out.println(nominals[i] +" :" + amount);
            }
        }

    }
}
