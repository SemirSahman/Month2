package ba.bitcamp.week14.day01.task4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

	static Connection conn = null;

	public static void main(String[] args) {

		try {
			Class.forName("org.sqlite.JDBC");
			System.out.println("Library loaded.");

			conn = DriverManager
					.getConnection("jdbc:sqlite:/Users/semir.sahman/Downloads/standings.db");
			System.out.println("Connection established");
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC library is not loaded.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		} catch (SQLException e) {
			System.err.println("Could not connect to the database.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}
		ArrayList<Team> list = new ArrayList<>();
		// try {
		// Statement statement = conn.createStatement();
		// // ResultSet result =
		// statement.executeQuery("select * from team order by (scoredplus - scoredminus) desc");
		// ResultSet result =
		// statement.executeQuery("select * from team order by fromgroup,points");
		// while (result.next()) {
		// int id = result.getInt(1);
		// String name = result.getString(2);
		// int wins = result.getInt(3);
		// int losses = result.getInt(4);
		// int points = result.getInt(5);
		// int scoredPlus = result.getInt(6);
		// int scoredMinus = result.getInt(7);
		// String fromGroup = result.getString(8);
		//
		// Team t = new Team(id, name, wins, losses, points, scoredPlus,
		// scoredMinus, fromGroup);
		// list.add(t);
		// System.out.println(t);
		// }
		// } catch (SQLException e) {
		// System.err.println("Bad SQL command.");
		// System.err.println("Msg: " + e.getMessage());
		// System.exit(1);
		// }

		 selectFromGroup("D");
		// printKnockoutTeams();
		//mostPointsScored(6);
		//printUnluckiestTeams();

		// System.out.println(list);

	}

	public static void selectFromGroup(String g) {

		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement
					.executeQuery("select * from team where fromgroup ='" + g
							+ "'");
			while (result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				int wins = result.getInt(3);
				int losses = result.getInt(4);
				int points = result.getInt(5);
				int scoredPlus = result.getInt(6);
				int scoredMinus = result.getInt(7);
				String fromGroup = result.getString(8);

				Team t = new Team(id, name, wins, losses, points, scoredPlus,
						scoredMinus, fromGroup);
				System.out.println(t);
			}

		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}
	}

	public static void printKnockoutTeams() {

		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement
					.executeQuery("select * from team where points >4 order by fromgroup ");
			while (result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				int wins = result.getInt(3);
				int losses = result.getInt(4);
				int points = result.getInt(5);
				int scoredPlus = result.getInt(6);
				int scoredMinus = result.getInt(7);
				String fromGroup = result.getString(8);

				Team t = new Team(id, name, wins, losses, points, scoredPlus,
						scoredMinus, fromGroup);
				System.out.println(t);
			}

		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}

	}

	public static void mostPointsScored(int pointsGot) {

		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement
					.executeQuery("select * from team where scoredplus = (select max(scoredplus) from team where points="
							+ pointsGot + ")");
			while (result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				int wins = result.getInt(3);
				int losses = result.getInt(4);
				int points = result.getInt(5);
				int scoredPlus = result.getInt(6);
				int scoredMinus = result.getInt(7);
				String fromGroup = result.getString(8);

				Team t = new Team(id, name, wins, losses, points, scoredPlus,
						scoredMinus, fromGroup);
				System.out.println(t);
			}

		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}

	}
	
	public static void printUnluckiestTeams() {

		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement
					.executeQuery("select * from team order by(scoredplus/points)");
			while (result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				int wins = result.getInt(3);
				int losses = result.getInt(4);
				int points = result.getInt(5);
				int scoredPlus = result.getInt(6);
				int scoredMinus = result.getInt(7);
				String fromGroup = result.getString(8);

				Team t = new Team(id, name, wins, losses, points, scoredPlus,
						scoredMinus, fromGroup);
				int temp = scoredPlus/points;
				System.out.println(t.toString() + " COEFICIENT: " + temp);
			}

		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}

	}

}
