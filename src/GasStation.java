public class GasStation {
    public static void main(String[] args) {
        int[] gas = {2,3,4};
        int[] cost = {3,4,3};

        int index = -1;
        String val = "";

        for (int loop = 0; loop < gas.length; loop++) {

            if (val.equals("circuit")) break;

            int tank = 0;
            int count = 0;
            int per_unit = loop;

            while (count < gas.length) {
                tank = tank + gas[per_unit] - cost[per_unit];

                if (tank < 0) break;

                // move circular
                per_unit++;
                if (per_unit == gas.length) per_unit = 0;

                count++;

                if (count == gas.length) {
                    index = loop;
                    val = "circuit";
                    break;
                }
            }
        }

        System.out.println(val);
        System.out.println(index);
    }
}