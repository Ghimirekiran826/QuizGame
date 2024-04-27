package quizMain.com;
import java.util.Scanner;
import java.util.Random;
public class QuizRunnable {
	static int option;
	String answer;
	UserProfile currentUser;
	void quizLoginInterface()
	{
		System.out.println("=============================================");
	    System.out.println("           Welcome to Quiz Fest              ");
	    System.out.println("=============================================");
	    System.out.println("Please login to check your knowledge.");
	    System.out.println("=============================================");
	}
	void quizSystemInterface()
	{
		System.out.println("=============================================");
        System.out.println("               Quiz Fest Menu                 ");
        System.out.println("=============================================");
        System.out.println("1. Sports Quiz");
        System.out.println("2. National Quiz");
        System.out.println("=============================================");
	}
	void quizUserInput()
	{
		System.out.println("Your choice ?");
		option = (new Scanner(System.in).nextInt());
		
	}
	void quizEngine(int option)
	{

			  if (currentUser == null) {
			        System.out.println("Please login first.");
			        return;
			    }
			    
			  // Create a Random object for quiz question
		        Random random = new Random();

		        // Create a list to store selected questions
		        int[] selectedIndices = new int[5];

		        // Fill the list with unique random indices
		        for (int i = 0; i < selectedIndices.length; i++) {
		            int index;
		            boolean duplicate;
		            do {
		                index = random.nextInt(50); // Assuming there are 50 questions
		                duplicate = false;
		                // Check if the index is already selected
		                for (int j = 0; j < i; j++) {
		                    if (selectedIndices[j] == index) {
		                        duplicate = true;
		                        break;
		                    }
		                }
		            } while (duplicate); // If it's a duplicate, generate a new index
		            selectedIndices[i] = index;
		        }

		        // Display questions based on the selected indices
		        if (option == 1) {
		            System.out.println("Welcome to the Sports Quiz!");
		            String[][] sportsQuestions = {
		            		{"1. What is the national game of Nepal?", "a) Football", "b) Volleyball", "c) Kabaddi", "d) Cricket", "c"},
		        		    {"2. Which sport is known as 'the king of sports'?", "a) Football", "b) Cricket", "c) Tennis", "d) Basketball", "b"},
		        		    {"3. Who won the ICC Cricket World Cup 2019?", "a) India", "b) Australia", "c) England", "d) New Zealand", "c"},
		        		    {"4. In which sport do competitors use a piece of equipment called a foil?", "a) Fencing", "b) Archery", "c) Javelin throw", "d) Pole vault", "a"},
		        		    {"5. Which country hosted the FIFA World Cup in 2018?", "a) Germany", "b) Brazil", "c) Russia", "d) France", "c"},
		        		    {"6. What is the only team sport where a player can touch the ball with their hands?", "a) Basketball", "b) Rugby", "c) Volleyball", "d) Soccer", "d"},
		        		    {"7. How many players are on a baseball team?", "a) 9", "b) 10", "c) 11", "d) 12", "a"},
		        		    {"8. Which sport is known as 'the sport of kings'?", "a) Golf", "b) Polo", "c) Tennis", "d) Horse racing", "b"},
		        		    {"9. Who won the gold medal in men's singles tennis at the 2016 Rio Olympics?", "a) Rafael Nadal", "b) Novak Djokovic", "c) Andy Murray", "d) Roger Federer", "c"},
		        		    {"10. In which year did the first modern Olympic Games take place?", "a) 1896", "b) 1900", "c) 1908", "d) 1912", "a"},
		        		    {"11. What is the diameter of a basketball hoop in inches?", "a) 16", "b) 18", "c) 20", "d) 22", "b"},
		        		    {"12. Who is the only athlete to win Olympic gold in the 100m, 200m, and 4x100m relay?", "a) Carl Lewis", "b) Usain Bolt", "c) Jesse Owens", "d) Michael Johnson", "b"},
		        		    {"13. Which country has won the most FIFA World Cup titles?", "a) Brazil", "b) Germany", "c) Italy", "d) Argentina", "a"},
		        		    {"14. In which sport would you perform an ollie?", "a) Skateboarding", "b) Snowboarding", "c) Surfing", "d) Skiing", "a"},
		        		    {"15. How many points is a touchdown worth in American football?", "a) 3", "b) 6", "c) 7", "d) 8", "b"},
		        		    {"16. What is the maximum score achievable in a single break in snooker?", "a) 147", "b) 155", "c) 180", "d) 200", "a"},
		        		    {"17. Who is the highest-scoring player in NBA history?", "a) Kobe Bryant", "b) LeBron James", "c) Michael Jordan", "d) Kareem Abdul-Jabbar", "d"},
		        		    {"18. What is the most popular sport in Japan?", "a) Sumo wrestling", "b) Baseball", "c) Soccer", "d) Judo", "b"},
		        		    {"19. Who holds the record for the fastest marathon time?", "a) Eliud Kipchoge", "b) Haile Gebrselassie", "c) Kenenisa Bekele", "d) Dennis Kimetto", "a"},
		        		    {"20. Which country won the first Cricket World Cup?", "a) England", "b) West Indies", "c) Australia", "d) India", "a"},
		        		    {"21. What is the name of the horse race that completes the Triple Crown?", "a) Belmont Stakes", "b) Preakness Stakes", "c) Kentucky Derby", "d) Melbourne Cup", "a"},
		        		    {"22. Who is the only player to have won FIFA World Player of the Year three times in a row?", "a) Lionel Messi", "b) Cristiano Ronaldo", "c) Zinedine Zidane", "d) Ronaldinho", "a"},
		        		    {"23. Which athlete has won the most Olympic gold medals?", "a) Michael Phelps", "b) Usain Bolt", "c) Carl Lewis", "d) Larisa Latynina", "a"},
		        		    {"24. In which year was the first Tour de France held?", "a) 1899", "b) 1903", "c) 1910", "d) 1919", "b"},
		        		    {"25. Who is the all-time leading goal scorer in FIFA World Cup history?", "a) Lionel Messi", "b) Cristiano Ronaldo", "c) Pele", "d) Miroslav Klose", "d"},
		        		    {"26. Which sport uses the terms love, deuce, and ace?", "a) Tennis", "b) Golf", "c) Badminton", "d) Table tennis", "a"},
		        		    {"27. What is the highest possible score in a game of ten-pin bowling?", "a) 200", "b) 300", "c) 400", "d) 500", "b"},
		        		    {"28. Who is the only player to have scored in every minute of a soccer match?", "a) Cristiano Ronaldo", "b) Lionel Messi", "c) Neymar Jr.", "d) Zlatan Ibrahimovic", "d"},
		        		    {"29. In which year did women's boxing become an Olympic event?", "a) 2000", "b) 2004", "c) 2008", "d) 2012", "c"},
		        		    {"30. What is the longest race in the NASCAR Cup Series?", "a) Daytona 500", "b) Coca-Cola 600", "c) Southern 500", "d) Brickyard 400", "b"},
		        		    {"31. What is the oldest sport in the world?", "a) Wrestling", "b) Boxing", "c) Running", "d) Archery", "a"},
		        		    {"32. How many players are on a volleyball team?", "a) 5", "b) 6", "c) 7", "d) 8", "b"},
		        		    {"33. Who won the first ever Super Bowl?", "a) Green Bay Packers", "b) Kansas City Chiefs", "c) New York Jets", "d) Dallas Cowboys", "a"},
		        		    {"34. What is the only ball sport to be played on the moon?", "a) Tennis", "b) Golf", "c) Soccer", "d) Baseball", "b"},
		        		    {"35. Who was the first female gymnast to score a perfect 10 at the Olympics?", "a) Nadia Comaneci", "b) Simone Biles", "c) Olga Korbut", "d) Mary Lou Retton", "a"},
		        		    {"36. Which country invented the sport of baseball?", "a) United States", "b) England", "c) Canada", "d) Australia", "a"},
		        		    {"37. What is the diameter of a standard basketball?", "a) 27 inches", "b) 28.5 inches", "c) 29.5 inches", "d) 30 inches", "c"},
		        		    {"38. What is the only country to have competed in every World Cup?", "a) Brazil", "b) Germany", "c) Argentina", "d) Italy", "a"},
		        		    {"39. Which sport is called The Gentleman's Sport?", "a) Cricket", "b) Golf", "c) Tennis", "d) Rugby", "a"},
		        		    {"40. Who is the only Formula One driver to win the World Championship with Ferrari?", "a) Michael Schumacher", "b) Lewis Hamilton", "c) Sebastian Vettel", "d) Fernando Alonso", "a"},
		        		    {"41. In which country did volleyball originate?", "a) United States", "b) Brazil", "c) Italy", "d) Philippines", "a"},
		        		    {"42. Who won the FIFA Women's World Cup in 2019?", "a) United States", "b) Netherlands", "c) Sweden", "d) England", "a"},
		        		    {"43. What is the national sport of Canada?", "a) Ice hockey", "b) Lacrosse", "c) Soccer", "d) Curling", "a"},
		        		    {"44. Who is the only player to have won the Ballon d'Or with three different clubs?", "a) Lionel Messi", "b) Cristiano Ronaldo", "c) Michel Platini", "d) Marco van Basten", "a"},
		        		    {"45. What is the circumference of a standard tennis ball?", "a) 2.5 inches", "b) 2.75 inches", "c) 2.9 inches", "d) 3 inches", "b"},
		        		    {"46. Which country won the first ever Rugby World Cup?", "a) New Zealand", "b) South Africa", "c) Australia", "d) England", "d"},
		        		    {"47. What is the maximum number of clubs allowed in a golfer's bag during a round?", "a) 10", "b) 14", "c) 16", "d) 20", "b"},
		        		    {"48. Who won the 2020 NBA Championship?", "a) Los Angeles Lakers", "b) Miami Heat", "c) Boston Celtics", "d) Toronto Raptors", "a"},
		        		    {"49. Which sport has been called the sport of kings?", "a) Polo", "b) Tennis", "c) Golf", "d) Horse racing", "d"},
		        		    {"50. Who holds the record for the longest home run in MLB history?", "a) Babe Ruth", "b) Mickey Mantle", "c) Barry Bonds", "d) Josh Gibson", "c"}
		        		};
		            for (int index : selectedIndices) {
		                String[] question = sportsQuestions[index];
		                System.out.println(question[0]);
		                for (int i = 1; i < question.length - 1; i++) {
		                    System.out.println(question[i]);
		                }
		                System.out.print("Your answer: ");
		                String answer = new Scanner(System.in).nextLine().trim().toLowerCase();
		                if (answer.equals(question[question.length - 1])) {
		                    System.out.println("Correct!");
		                    currentUser.updateScore(true);
		                } else {
		                    System.out.println("Incorrect. The correct answer is " + question[question.length - 1]);
		                    currentUser.updateScore(false);
		                }
		            }
		        } 
		else if(option == 2)
		{
			 if (currentUser == null) {
			        System.out.println("Please login first.");
			        return;
			    }
			 
			System.out.println("Welcome to the National Quiz!");
			String[][] nationalQuestions = {
					{"1. What is the capital of Nepal?", "a) Kathmandu", "b) Pokhara", "c) Birgunj", "d) Lalitpur", "a"},
		            {"2. Which is the highest mountain in Nepal?", "a) Mount Kanchenjunga", "b) Mount Everest", "c) Mount Annapurna", "d) Mount Makalu", "b"},
		            {"3. What is the official language of Nepal?", "a) Nepali", "b) Hindi", "c) English", "d) Sanskrit", "a"},
		            {"4. Nepal is located in which continent?", "a) Asia", "b) Europe", "c) South America", "d) Africa", "a"},
		            {"5. Which festival is known as the festival of lights in Nepal?", "a) Dashain", "b) Tihar", "c) Holi", "d) Diwali", "b"},
		            {"6. What is the second-largest city in Nepal?", "a) Pokhara", "b) Biratnagar", "c) Lalitpur", "d) Bharatpur", "b"},
		            {"7. Who is known as the 'Light of Asia'?", "a) Gautama Buddha", "b) King Ashoka", "c) Mahatma Gandhi", "d) Rabindranath Tagore", "a"},
		            {"8. Which river is known as the 'Sorrow of Bihar'?", "a) Gandaki", "b) Koshi", "c) Bagmati", "d) Narayani", "b"},
		            {"9. What is the currency of Nepal?", "a) Rupee", "b) Taka", "c) Riel", "d) Kyat", "a"},
		            {"10. What is the largest ethnic group in Nepal?", "a) Newar", "b) Gurung", "c) Sherpa", "d) Chhetri", "d"},
		            {"11. Who was the first king of the Kingdom of Nepal?", "a) Prithvi Narayan Shah", "b) Gyanendra Bir Bikram Shah", "c) Birendra Bir Bikram Shah", "d) Mahendra Bir Bikram Shah", "a"},
		            {"12. What is the name of the famous temple dedicated to Lord Shiva located in Kathmandu?", "a) Pashupatinath Temple", "b) Swayambhunath Stupa", "c) Boudhanath Stupa", "d) Budhanilkantha Temple", "a"},
		            {"13. Which animal is the national symbol of Nepal?", "a) Cow", "b) Tiger", "c) Rhino", "d) Elephant", "c"},
		            {"14. Which dynasty ruled Nepal for the longest period?", "a) Shah dynasty", "b) Rana dynasty", "c) Thakuri dynasty", "d) Malla dynasty", "a"},
		            {"15. Which is the largest lake in Nepal?", "a) Rara Lake", "b) Phewa Lake", "c) Begnas Lake", "d) Tilicho Lake", "a"},
		            {"16. What is the name of the traditional Nepali dress worn by women?", "a) Daura Suruwal", "b) Sari", "c) Lehenga Choli", "d) Kurti", "a"},
		            {"17. Which famous mountain climber from New Zealand became the first person to reach the summit of Mount Everest?", "a) Tenzing Norgay", "b) Edmund Hillary", "c) Reinhold Messner", "d) Junko Tabei", "b"},
		            {"18. What is the name of the ancient trade route that connected China with the Indian subcontinent?", "a) Spice Route", "b) Silk Road", "c) Amber Road", "d) Incense Route", "b"},
		            {"19. Which year did Nepal become a federal democratic republic?", "a) 2006", "b) 2008", "c) 2010", "d) 2015", "b"},
		            {"20. What is the literacy rate of Nepal according to the latest census?", "a) 65%", "b) 70%", "c) 75%", "d) 80%", "c"},
		            {"21. Which ancient kingdom was located in present-day Kathmandu Valley?", "a) Gandhara", "b) Kalinga", "c) Magadha", "d) Licchavi", "d"},
		            {"22. Which famous writer from Nepal won the Madan Puraskar for his novel 'Palpasa Café'?", "a) Samrat Upadhyay", "b) Manjushree Thapa", "c) Narayan Wagle", "d) Diamond Shumsher Rana", "c"},
		            {"23. What is the name of the traditional Newari festival celebrated in honor of the goddess of wealth?", "a) Dashain", "b) Tihar", "c) Indra Jatra", "d) Teej", "c"},
		            {"24. Which UNESCO World Heritage Site in Nepal is also known as the 'City of Devotees'?", "a) Bhaktapur Durbar Square", "b) Patan Durbar Square", "c) Kathmandu Durbar Square", "d) Lumbini", "a"},
		            {"25. Which famous festival is celebrated in the Kathmandu Valley to worship the god of rain, Indra?", "a) Teej", "b) Dashain", "c) Tihar", "d) Indra Jatra", "d"},
		            {"26. What is the name of the traditional Newari dish consisting of lentils, beans, rice, meat, and spices?", "a) Dal Bhat", "b) Momo", "c) Dhido", "d) Gundruk", "a"},
		            {"27. Which Hindu festival celebrates the bond between brothers and sisters?", "a) Teej", "b) Raksha Bandhan", "c) Bhai Tika", "d) Janai Purnima", "b"},
		            {"28. Which mountain range forms the northern border of Nepal?", "a) Himalayas", "b) Karakoram Range", "c) Aravalli Range", "d) Western Ghats", "a"},
		            {"29. What is the name of the famous national park in Nepal known for its Bengal tigers?", "a) Chitwan National Park", "b) Sagarmatha National Park", "c) Langtang National Park", "d) Bardia National Park", "a"},
		            {"30. Who is the founder of Buddhism and the original Buddha?", "a) Siddhartha Gautama", "b) Mahavira", "c) Ashoka the Great", "d) Chandragupta Maurya", "a"},
		            {"31. What is the name of the traditional Newari fermented leafy green vegetable?", "a) Dhido", "b) Gundruk", "c) Sel Roti", "d) Aloo Tama", "b"},
		            {"32. Which ancient city in Nepal was known as 'Kapilavastu' and is believed to be the birthplace of Gautama Buddha?", "a) Lumbini", "b) Janakpur", "c) Bhaktapur", "d) Patan", "a"},
		            {"33. Which river flows through the deepest gorge in the world, the Kali Gandaki Gorge?", "a) Koshi River", "b) Karnali River", "c) Seti River", "d) Narayani River", "b"},
		            {"34. What is the name of the famous Hindu temple located in the lakeside town of Pokhara?", "a) Manakamana Temple", "b) Bindhyabasini Temple", "c) Gupteshwor Cave Temple", "d) Tal Barahi Temple", "d"},
		            {"35. Which bird is the national bird of Nepal?", "a) Peacock", "b) Sparrow", "c) Himalayan Monal", "d) Dove", "c"},
		            {"36. What is the name of the traditional Nepali rice wine?", "a) Raksi", "b) Chhang", "c) Thon", "d) Tongba", "a"},
		            {"37. Which famous Nepali festival celebrates the victory of good over evil?", "a) Dashain", "b) Tihar", "c) Holi", "d) Diwali", "a"},
		            {"38. What is the name of the famous trekking route in Nepal that encircles the Annapurna Massif?", "a) Everest Base Camp Trek", "b) Langtang Valley Trek", "c) Annapurna Circuit Trek", "d) Manaslu Circuit Trek", "c"},
		            {"39. Which ethnic group is known for their traditional brass and copper craftsmanship in Nepal?", "a) Newar", "b) Tharu", "c) Sherpa", "d) Tamang", "a"},
		            {"40. Which mountain range lies to the south of Nepal?", "a) Himalayas", "b) Aravalli Range", "c) Western Ghats", "d) Vindhya Range", "d"},
		            {"41. What is the name of the traditional Newari festival celebrated to honor the deity of rain, Rato Machhindranath?", "a) Dashain", "b) Tihar", "c) Bisket Jatra", "d) Teej", "c"},
		            {"42. Who is known as the 'Father of Modern Nepal'?", "a) Prithvi Narayan Shah", "b) Birendra Bir Bikram Shah", "c) Gyanendra Bir Bikram Shah", "d) Mahendra Bir Bikram Shah", "a"},
		            {"43. Which ancient city in Nepal is known for its pagoda-style temples and is a UNESCO World Heritage Site?", "a) Bhaktapur", "b) Patan", "c) Kathmandu", "d) Janakpur", "a"},
		            {"44. What is the name of the traditional Newari rice flour bread cooked on a hot griddle?", "a) Dhido", "b) Sel Roti", "c) Bara", "d) Yomari", "b"},
		            {"45. Which Hindu festival marks the beginning of the New Year in Nepal?", "a) Dashain", "b) Tihar", "c) Holi", "d) Nepali New Year", "d"},
		            {"46. What is the name of the traditional musical instrument played during religious ceremonies and festivals in Nepal?", "a) Tabla", "b) Sarangi", "c) Bansuri", "d) Madal", "d"},
		            {"47. Which ancient kingdom in Nepal was known for its well-preserved wooden architecture and intricate carvings?", "a) Bhaktapur", "b) Patan", "c) Kathmandu", "d) Janakpur", "a"},
		            {"48. What is the name of the traditional Newari dish made from fermented soybeans?", "a) Dhido", "b) Yomari", "c) Bara", "d) Kwati", "d"},
		            {"49. Which famous Nepali festival celebrates the bond between brothers and sisters and involves the tying of colorful threads?", "a) Dashain", "b) Tihar", "c) Raksha Bandhan", "d) Bhai Tika", "d"},
		            {"50. Which ancient city in Nepal is believed to be the birthplace of Sita, the wife of Lord Rama?", "a) Lumbini", "b) Janakpur", "c) Bhaktapur", "d) Patan", "b"}
		        };

			 for (int index : selectedIndices) {
	                String[] question = nationalQuestions[index];
	                System.out.println(question[0]);
	                for (int i = 1; i < question.length - 1; i++) {
	                    System.out.println(question[i]);
	                }
	                System.out.print("Your answer: ");
	                String answer = new Scanner(System.in).nextLine().trim().toLowerCase();
	                if (answer.equals(question[question.length - 1])) {
	                    System.out.println("Correct!");
	                    currentUser.updateScore(true);
	                } else {
	                    System.out.println("Incorrect. The correct answer is " + question[question.length - 1]);
	                    currentUser.updateScore(false);
	                }
	            }
	        } 
			    
		//add more quiz 
		else
		{
			System.out.println("Invalid option");
		}
		
	}
	 void loginUser() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your username: ");
	        String username = scanner.nextLine();
	        System.out.println("Enter your password: ");
	        String password = scanner.nextLine();
	        
	        if (username.equals("kriti") && password.equals("kriti")) {
	            currentUser = new UserProfile(username, password);
	            System.out.println("Login successful!");
	        } else {
	            System.out.println("Incorrect username or password.");
	        }
	    }
public static void main(String[] args) {
	String continueOption;
	
	QuizRunnable quizRunnable = new QuizRunnable();

	
	
	do {
		
		quizRunnable.quizLoginInterface();
		quizRunnable.loginUser();
		quizRunnable.quizSystemInterface();
		quizRunnable.quizUserInput();
		quizRunnable.quizEngine(option);
		if (quizRunnable.currentUser != null) {
	        quizRunnable.currentUser.displayReport();
	    }
	

		 // Ask the user if they want to continue
	    System.out.println("Do you want to continue? (Press 'Y' to continue, any other key to exit)");
	    continueOption = new Scanner(System.in).nextLine();
	    
	    
	}while(continueOption.equalsIgnoreCase("Y"));
	
    System.out.println("Thank you for playing. Goodbye!");
    
    
    
}
}
