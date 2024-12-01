import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Day1 {

    int part1() {
        int part1 = 0;
        LinkedList<Integer> left = new LinkedList<>();
        LinkedList<Integer> right = new LinkedList<>();
        try (Stream<String> stream = Files.lines(Paths.get("src/main/resources/day1"))) {
            for (String line : stream.toList()) {
                String[] split = line.split("   ");
                left.add(Integer.parseInt(split[0]));
                right.add(Integer.parseInt(split[1]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Collections.sort(left);
        Collections.sort(right);
        for (int i = 0; i < left.size(); i++) {
            part1 += Math.abs(left.get(i) - right.get(i));
        }
        return part1;
    }

    int part2() {
        int part2 = 0;
        LinkedList<Integer> left = new LinkedList<>();
        LinkedList<Integer> right = new LinkedList<>();
        try (Stream<String> stream = Files.lines(Paths.get("src/main/resources/day1"))) {
            for (String line : stream.toList()) {
                String[] split = line.split("   ");
                left.add(Integer.parseInt(split[0]));
                right.add(Integer.parseInt(split[1]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Collections.sort(left);
        for (int i = 0; i < left.size(); i++) {
            part2 += left.get(i) * appears(left.get(i), right);
        }
        return part2;
    }

    int appears(int a, LinkedList<Integer> list) {
        return (int) list.stream().filter(s -> s.equals(a)).count();
    }

}
