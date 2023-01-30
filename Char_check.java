import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class GreetPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Registriere Listener
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Hole den Namen des Spielers
        String name = event.getPlayer().getName();

        // Frage den Spieler nach seinem Namen
        event.getPlayer().sendMessage("What's your name?");

        // Setze den Namen des Spielers
        event.getPlayer().setPlayerListName(name);

        // Begrüße den Spieler
        event.getPlayer().sendMessage("Welcome, " + name + "!");
    }
}
