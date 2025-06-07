import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualCycle {
    private LocalDate lastPeriodStart;
    private int cycleLength;
    private int periodLength;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public MenstrualCycle(String lastPeriodStart, int cycleLength, int periodLength) {
        this.lastPeriodStart = LocalDate.parse(lastPeriodStart, formatter);
        this.cycleLength = cycleLength;
        this.periodLength = periodLength;
    }

    public LocalDate calculateNextPeriod() {
        return lastPeriodStart.plusDays(cycleLength);
    }

    public LocalDate calculateOvulation() {
        return lastPeriodStart.plusDays(cycleLength / 2);
    }

    public LocalDate[] calculateFertileWindow() {
        LocalDate ovulation = calculateOvulation();
        return new LocalDate[] { ovulation.minusDays(2), ovulation.plusDays(2) };
    }

    public LocalDate[][] calculateSafePeriods() {
        LocalDate fertileStart = calculateFertileWindow()[0];
        LocalDate fertileEnd = calculateFertileWindow()[1];

        LocalDate safe1Start = lastPeriodStart.plusDays(periodLength);
        LocalDate safe1End = fertileStart.minusDays(1);

        LocalDate safe2Start = fertileEnd.plusDays(1);
        LocalDate safe2End = calculateNextPeriod().minusDays(1);

        return new LocalDate[][] {
            {safe1Start, safe1End},
            {safe2Start, safe2End}
        };
    }

    public String getCycleInfo() {
        LocalDate nextPeriod = calculateNextPeriod();
        LocalDate ovulation = calculateOvulation();
        LocalDate[] fertile = calculateFertileWindow();
        LocalDate[][] safePeriods = calculateSafePeriods();

        return "Next Period Start: " + nextPeriod.format(formatter) + "\n" +
               "Ovulation Date: " + ovulation.format(formatter) + "\n" +
               "Fertile Window: " + fertile[0].format(formatter) + " to " + fertile[1].format(formatter) + "\n" +
               "Safe Periods:\n" +
               "  1. " + safePeriods[0][0].format(formatter) + " to " + safePeriods[0][1].format(formatter) + "\n" +
               "  2. " + safePeriods[1][0].format(formatter) + " to " + safePeriods[1][1].format(formatter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start date of your last period (yyyy-MM-dd):");
        String lastPeriodStart = scanner.nextLine();

        System.out.println("Enter your cycle length:");
        int cycleLength = scanner.nextInt();

        System.out.println("Enter your period length:");
        int periodLength = scanner.nextInt();

        MenstrualCycle cycle = new MenstrualCycle(lastPeriodStart, cycleLength, periodLength);
        System.out.println("\n=== Your Menstrual Cycle Info ===");
        System.out.println(cycle.getCycleInfo());
    }
}