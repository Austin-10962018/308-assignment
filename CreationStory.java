import java.util.ArrayList;
import java.util.List;

class CreationEvent {
    private int day;
    private String description;
    private String emoji;

    public CreationEvent(int day, String description, String emoji) {
        this.day = day;
        this.description = description;
        this.emoji = emoji;
    }

    @Override
    public String toString() {
        return "Day " + day + ": " + description + " " + emoji;
    }
}


public class CreationStory {
    public static void main(String[] args) {
        List<CreationEvent> creationEvents = new ArrayList<>();

        creationEvents.add(new CreationEvent(1, "God created light", "💡"));
        creationEvents.add(new CreationEvent(2, "God created the sky", "🌌"));
        creationEvents.add(new CreationEvent(3, "God created dry land, seas, plants, and trees", "🌍"));
        creationEvents.add(new CreationEvent(4, "God created the Sun, Moon, and stars", "🌞🌜⭐"));
        creationEvents.add(new CreationEvent(5, "God created the sea creatures and birds", "🐟🦅"));
        creationEvents.add(new CreationEvent(6, "God created animals and humans", "🐘👫"));
        creationEvents.add(new CreationEvent(7, "God rested", "😴"));

        for (CreationEvent event : creationEvents) {
            System.out.println(event);
        }
    }
}
