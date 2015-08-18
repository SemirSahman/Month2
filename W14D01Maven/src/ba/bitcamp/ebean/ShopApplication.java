package ba.bitcamp.ebean;

import java.math.BigDecimal;

import org.avaje.agentloader.AgentLoader;

import ba.bitcamp.ebean.models.Product;
import ba.bitcamp.ebean.models.Purchase;
import ba.bitcamp.ebean.models.User;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;

public class ShopApplication {

	static {
		AgentLoader.loadAgentFromClasspath("avaje-ebeanorm-agent",
				"debug=1;packages=ba.bitcamp.ebean.models.**");
	}

	private static EbeanServer server = Ebean.getServer("h2");

	public static void main(String[] args) {

		User first = new User();
		first.setFullName("Mase zna se");
		first.setEmail("maseznase@bitcamp.ba");
		first.setBalance(new BigDecimal(0));

		// Ebean.save(first);

		Product monitor = new Product();
		monitor.setTitle("Monitor, Dell 28\"");
		monitor.setPrice(new BigDecimal("399.99"));
		monitor.setQuantity(0);

		// Ebean.save(monitor);

		monitor.setQuantity(10);

		// Ebean.save(monitor);
		// System.out.println(monitor.getId());

		Purchase firstUserPurchasedMonitor = new Purchase();
		firstUserPurchasedMonitor.setUser(first);
		firstUserPurchasedMonitor.setProduct(monitor);

		first.setBalance(first.getBalance().subtract(monitor.getPrice()));
		monitor.setQuantity(monitor.getQuantity() - 1);

		Ebean.save(firstUserPurchasedMonitor);

		System.out.println(firstUserPurchasedMonitor.getId());
		System.out.println(firstUserPurchasedMonitor.getProduct());
		System.out.println(firstUserPurchasedMonitor.getUser());

	}

}
