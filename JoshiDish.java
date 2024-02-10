
package customersServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class JoshiDish {

	String Options = "1. View current balance in the account \n" + "2. Recharge Account \n"
			+ "3. View available packs, channels and services \n" + "4. Subscribe to base packs \n"
			+ "5. Add channels to existing subscription \n" + "6. Subscribe to special service \n"
			+ "7. View currennt subscription details \n" + "8. Update Email and Phone number for notification \n"
			+ "9. Exit";
	Channel ch;
	Services serv;
	static ArrayList<String> channels;
	static String serviceName = "";
	static int current_balance = 100;
	static String channellNames = "sample channels";
	static Map<String, Integer> packs = new HashMap<String, Integer>();

	public int getOptions() {
		JoshiDish cl = new JoshiDish();
		System.out.println(cl.Options);
		System.out.println("Enter the Option");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int option = Integer.parseInt(sc.nextLine());

			switch (option) {
			case 1:
				// for checking available balance
				System.out.println("Current balance : " + cl.current_balance);
				// System.out.println("Enter the Option");
				break;
			case 2:
				cl.recharge();
				// System.out.println("Enter the Option");
				break;
			case 3:
				System.out.println("View available packs, channels and services \n");
				cl.availablePacks();
				// System.out.println("Enter the Option");
				break;
			case 4:
				cl.channelPack();
				// System.out.println("Enter the Option");
				break;
			case 5:
				cl.addChannel();
				// System.out.println("Enter the Option");
				break;
			case 6:
				cl.specialService();
				// System.out.println("Enter the Option");
				break;
			case 7:
				cl.allsubscription();
				// System.out.println("Enter the Option");
				break;
			case 8:
				cl.updateEmailPhno();
				// System.out.println("Enter the Option");
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}
			System.out.println("=======================================================================");
			return option;
		} else {
			String st1 = sc.nextLine();
			System.out.println("Invalid input !! Please enter number (1 - 9) only");
			System.out.println("=======================================================================");
			return 0;
		}

	}

	// to recharge account case 2
	private void recharge() {
		System.out.println("Enter the amount to recharge: ");
		Scanner sd = new Scanner(System.in);
		int amt = sd.nextInt();
		current_balance = current_balance + amt;
		System.out.println("Account balance: " + current_balance);
		System.out.println("=======================================================================");

	}

	// Available packs channels and services case 3
	private void availablePacks() {
		System.out.println("Available packs for Subscription");
		System.out.println("Silver Pack : Zee, Sony, Star Plus: 50 Rs");
		System.out.println("Gold Pack : Zee, Sony, Star Plus, Discovery, NatGeo: 100 Rs");
		System.out.println("Available Channels for Subscription");
		System.out.println(
				"Zee: 10 Rs \n" + "Sony: 15 Rs \n" + "Star plus: 20 Rs \n" + "Discovery: 10 Rs \n" + "NatGeo: 20 Rs");
		System.out.println("Available Services for Subscription");
		System.out.println("LearnEnglish Service: 200 Rs \n" + "LearnCooking Service: 100 Rs");
		System.out.println("===============================================================================");
	}

	// Get subscription case 4
	private Map<String, Integer> channelPack() {
		if (packs.isEmpty()) {
			System.out.println("Subscribe to channel packs");
			System.out.println("Enter pack you wish to subscribe: (Silver: 'S', Gold: 'G'): ");
			Scanner s1 = new Scanner(System.in);
			String pack = s1.nextLine();
			Integer months;
			if (pack.contains("s") || pack.contains("S")) {
				packs.put("Silver Pack", 50);
				if ((Integer) (packs.get("Silver Pack")) <= current_balance) {
					System.out.println("Enter the months: ");
					Scanner s2 = new Scanner(System.in);
					months = s2.nextInt();
					if ((Integer) (packs.get("Silver Pack")) * months <= current_balance) {
						System.out.println("Subscription amount: " + (Integer) (packs.get("Silver Pack")) * months);
						if (months >= 3) {
							Integer value = (Integer) packs.get("Silver Pack");
							int discount = value * months * 10 / 100;
							int final_price = (value * months) - discount;
							System.out.println("Discount Applied: " + discount);
							System.out.println("Final price after discount: " + final_price);
							System.out.println("Account Balance: " + (current_balance - final_price));
							current_balance = current_balance - final_price;
						}
					} else {
						System.out.println("Insufficient Balance");
					}
				} else {
					System.out.println("Insufficient Balance");
				}
				System.out.println("=======================================================================");
				return packs;
			} else if (pack.contains("g") || pack.contains("G")) {
				packs.put("Gold Pack", 100);
				if ((Integer) (packs.get("Gold Pack")) <= current_balance) {
					System.out.println("Enter the months: ");
					Scanner s2 = new Scanner(System.in);
					months = s2.nextInt();
					if ((Integer) (packs.get("Gold Pack")) * months <= current_balance) {
						System.out.println("Subscription amount: " + (Integer) (packs.get("Gold Pack")) * months);
						if (months >= 3) {
							Integer value = (Integer) packs.get("Gold Pack");
							int discount = value * months * 10 / 100;
							int final_price = (value * months) - discount;
							System.out.println("Discount Applied: " + discount);
							System.out.println("Final price after discount: " + final_price);
							System.out.println("Account Balance: " + (current_balance - final_price));
							current_balance = current_balance - final_price;
						}
					} else {
						System.out.println("Insufficient Balance");
					}
				} else {
					System.out.println("Insufficient Balance");
				}
				System.out.println("=======================================================================");
				return packs;
			} else {
				System.out.println("Wrong input");
				packs.put("", 0);
				System.out.println("=======================================================================");
				return packs;
			}
		} else {
			System.out.println("You have already subscribed base pack");
			packs.clear();
			packs.put("", 0);
			return packs;
		}
	}

	// to add channels case 5
	// Need to change the logic
	private ArrayList<String> addChannel() {
		if (!packs.isEmpty() && packs.containsKey("Gold Pack")) {
			System.out.println("You have subscribed Gold Pack & it contains all Channels");
			channels = new ArrayList<String>();
			channels.add("");
			System.out.println("=======================================================================");
			return channels;
		} else if (!packs.isEmpty() && packs.containsKey("Silver Pack")) {
			System.out.println("Add Channels to existing subscription");
			System.out.println("Enter channel names to add (seperated by commas): ");
			String subChannel = channellNames;
			Scanner s4 = new Scanner(System.in);
			channellNames = s4.nextLine();
			if (!channellNames.isEmpty()) {
				if (subChannel.equalsIgnoreCase(channellNames)) {
					System.out.println("You have aleady subscribed this Channels");
					channels = new ArrayList<String>();
					channels.add("");
					System.out.println("=======================================================================");
					return channels;
				}
				// subChannel = subChannel.concat(channellNames);
				if (subChannel.contains(channellNames)) {
					String str = channellNames.replace(',', ' ');
					str = str.replace(subChannel, "");
					str = str.trim();
					if (!str.isEmpty()) {
						System.out.println("You have aleady subscribed " + subChannel + " channel! Please type only "
								+ str + " if you want to subscribe " + str + " channel");
						channels = new ArrayList<String>();
						channels.add("");
						System.out.println("=======================================================================");
						return channels;
					} else {
						System.out.println("You have aleady subscribed this Channels");
						channels = new ArrayList<String>();
						channels.add("");
						System.out.println("=======================================================================");
						return channels;
					}
				}
			}
			String cnl[] = channellNames.split(",");
			ch = new Channel();
			for (String chnl : cnl) {
				if (chnl.equalsIgnoreCase("Discovery") || chnl.equalsIgnoreCase("Natgeo")
						|| chnl.equalsIgnoreCase("Natgeo") && chnl.equalsIgnoreCase("Discovery")) {
					if (chnl.equalsIgnoreCase("Discovery")) {
						current_balance = current_balance - ch.discovery;
					}
					if (chnl.equalsIgnoreCase("Natgeo")) {
						current_balance = current_balance - ch.natGeo;
					}
					System.out.println("Channels added successfully");
					System.out.println("Account balance: " + current_balance);
					System.out.println("=======================================================================");
					channels = new ArrayList<String>(Arrays.asList(cnl));
					return channels;
				} else {
					System.out.println("Invalid input");
					channels = new ArrayList<String>();
					channels.clear();
					channels.add("");
					System.out.println("=======================================================================");
					return channels;
				}
			}
		}
		channels = new ArrayList<String>();
		channels.clear();
		channels.add("");
		System.out.println("=======================================================================");
		return channels;
	}

	// get special service case 6
	// Need to change some logic
	private String specialService() {
		if (!packs.isEmpty() || packs.containsKey("Gold Pack")
				|| !packs.isEmpty() && packs.containsKey("Silver Pack")) {
			System.out.println("Subscribe to special service");
			System.out.println("Enter Service name(Type: 'LE' for LearnEnglish, 'LC' for LearnCooking"
					+ " and 'Both' for Both services): ");
			String sname = serviceName;
			Scanner s4 = new Scanner(System.in);
			serviceName = s4.nextLine();
			serv = new Services();
			if (serviceName.equalsIgnoreCase("LE")) {
				if (sname.isEmpty() || sname.equalsIgnoreCase("LC")) {
					if (current_balance >= 200) {
						System.out.println("LearnEnglish service subscribed");
						current_balance = current_balance - serv.learEnglish;
						System.out.println("Account Balance: " + current_balance);
						return serviceName;
					} else {
						System.out.println("insufficient balance");
						System.out.println("=======================================================================");
						return "";
					}
				} else {
					System.out.println("You have already subscribed LearnEnglish Service");
					return "";
				}
			} else if (serviceName.equalsIgnoreCase("LC")) {
				if (sname.isEmpty() || sname.equalsIgnoreCase("LE")) {
					if (current_balance >= 100) {
						System.out.println("LearnCooking service subscribed");
						current_balance = current_balance - serv.learnCooking;
						System.out.println("Account Balance: " + current_balance);
						return serviceName;
					} else {
						System.out.println("insufficient balance");
						System.out.println("=======================================================================");
						return "";
					}
				} else {
					System.out.println("You have already subscribed LearnCooking Service");
					return "";
				}
			} else if (serviceName.equalsIgnoreCase("Both")) {
				if (sname.isEmpty()) {
					if (current_balance >= 300) {
						System.out.println("LearnEnglish & LearnCooking services subscribed");
						current_balance = current_balance - serv.learEnglish - serv.learnCooking;
						System.out.println("Account Balance: " + current_balance);
						System.out.println("=======================================================================");
						return serviceName;
					} else {
						System.out.println("insufficient balance");
						System.out.println("=======================================================================");
						return "";
					}
				} else {
					if (sname.equalsIgnoreCase("LC")) {
						System.out.println(
								"You have already subscribed LearnCooking Service! now you can only subscribe LearnEnglish service");
						return "";
					} else {
						System.out.println(
								"You have already subscribed LearnEnglish Service! now you can only subscribe LearnCooking service");
						return "";
					}
				}
			} else
				System.out.println("Invalid input");
			System.out.println("=======================================================================");
			return "";
		} else {
			System.out.println("Invalid input");
			System.out.println("=======================================================================");
			return "";
		}
	}

	// All subscription details case 7
	private void allsubscription() {
		System.out.println("View current subscription details");
		Set packSet = packs.keySet();
		String subPack[] = new String[packSet.size()];
		if (packSet.size() == 1) {
			for (Object obj : packSet) {
				for (int i = 0; i < packSet.size(); i++)
					subPack[i] = (String) obj;
			}

			System.out.print("Currently subscribed packs and Channels: " + subPack[0] + " +");
			if (!channels.isEmpty()) {
				for (String chnel : channels)
					System.out.print(" " + chnel);
				System.out.println("=======================================================================");
			} else {
				System.out.println("No channel subscribed");
				System.out.println("=======================================================================");
			}
			System.out.println("=======================================================================");
		} else {
			System.out.println("No pack subscribed!!!");
			System.out.println("=======================================================================");
		}
		if (serviceName.equalsIgnoreCase("Both")) {
			System.out.println("Currently subscribed services: LearnEnglish and LearnCooking Service ");
			System.out.println("=======================================================================");
		} else {
			if (!serviceName.contentEquals("")) {
				System.out.println("Currently subscribed services: " + serviceName);
			} else {
				System.out.println("No service subscribed");
			}
			System.out.println("=======================================================================");
		}

	}

	// Email & Phone Notification case 8
	private void updateEmailPhno() {
		System.out.println("Update Email and Phone number for notification");
		System.out.println("Enter the Email");
		Scanner s4 = new Scanner(System.in);
		String email = s4.nextLine();
		System.out.println("Enter the Phone number");
		String PhNo = s4.nextLine();
		System.out.println("Email & Phone number updated successfully");
		System.out.println("=======================================================================");
	}

	public static void main(String[] args) throws Exception {
		JoshiDish c1 = new JoshiDish();
		while (c1.getOptions() != 9) {
			c1.getOptions();
		}
	}

	class Channel {
		int zee = 10;
		int sony = 15;
		int starPlus = 20;
		int discovery = 10;
		int natGeo = 20;

	}

	class Services {
		int learEnglish = 200;
		int learnCooking = 100;

	}

}