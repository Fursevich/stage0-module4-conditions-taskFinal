package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        int toBeAssigned = switch (monthNumber) {
            case 12-> {
                System.out.println("Winter");
                yield 12;
            }
            case 2-> {
                System.out.println("Winter");
                yield 12;
            }
            case 6-> {
                System.out.println("Summer");
                yield 12;
            }
            default-> {
                System.out.println("Wrong month number");
                yield 0;
            }
        };
    }
}
