import java.util.ArrayList;
import java.util.List;

public class CreationStory {
    private int day;
    private String description;
    private String emoji;

    public CreationStory(int day, String description, String emoji) {
        this.day = day;
        this.description = description;
        this.emoji = emoji;
    }

    @Override
    public String toString() {
        return "Day " + day + ": " + description + " " + emoji;
    }
}

public class GenesisCreation {
    public static void main(String[] args) {
        List<CreationStory> creationEvents = new ArrayList<>();

        creationEvents.add(new CreationStory(1, "God created light", "💡"));
        creationEvents.add(new CreationStory(2, "God created the sky", "🌌"));
        creationEvents.add(new CreationStory(3, "God created dry land, seas, plants, and trees", "🌍"));
        creationEvents.add(new CreationStory(4, "God created the Sun, Moon, and stars", "🌞🌜⭐"));
        creationEvents.add(new CreationStory(5, "God created the sea creatures and birds", "🐟🦅"));
        creationEvents.add(new CreationStory(6, "God created animals and humans", "🐘👫"));
        creationEvents.add(new CreationStory(7, "God rested", "😴"));

        for (CreationStory event : creationEvents) {
            System.out.println(event);
        }
    }
}
