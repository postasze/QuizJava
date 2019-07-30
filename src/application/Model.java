package application;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class Model {

	private static Model instance;

	private ArrayList<QuizQuestion> allQuestionsList;
	private ArrayList<QuizQuestion> availableQuestionsList;
	private QuizQuestion currentQuizQuestion;
	private int currentlyCheckedAnswerNumber;
	private int score;
	private int count;

	public Model() {
		createQuizQuestions();
		resetModel();
	}

	public void resetModel() {
		availableQuestionsList = (ArrayList<QuizQuestion>) allQuestionsList.clone();
		currentlyCheckedAnswerNumber = 0;
		score = 0;
		count = 0;
	}

	public static Model getInstance() {
		if (instance == null)
			instance = new Model();
		return instance;
	}

	public ArrayList<QuizQuestion> getAllQuestionsList() {
		return allQuestionsList;
	}

	public void setAllQuestionsList(ArrayList<QuizQuestion> allQuestionsList) {
		this.allQuestionsList = allQuestionsList;
	}

	public ArrayList<QuizQuestion> getAvailableQuestionsList() {
		return availableQuestionsList;
	}

	public void setAvailableQuestionsList(ArrayList<QuizQuestion> availableQuestionsList) {
		this.availableQuestionsList = availableQuestionsList;
	}

	public QuizQuestion getCurrentQuizQuestion() {
		return currentQuizQuestion;
	}

	public void setCurrentQuizQuestion(QuizQuestion currentQuizQuestion) {
		this.currentQuizQuestion = currentQuizQuestion;
	}

	public int getCurrentlyCheckedAnswerNumber() {
		return currentlyCheckedAnswerNumber;
	}

	public void setCurrentlyCheckedAnswerNumber(int currentlyCheckedAnswerNumber) {
		this.currentlyCheckedAnswerNumber = currentlyCheckedAnswerNumber;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void raiseScoreByOne() {
		this.score++;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void raiseCountByOne() {
		this.count++;
	}

	public void createQuizQuestions() {
		allQuestionsList = new ArrayList<QuizQuestion>();
		String question;
		String firstAnswer;
		String secondAnswer;
		String thirdAnswer;
		String fourthAnswer;
		int correctAnswerNumber;
		Image image;

		question = "Na zdjęciu przedstawiono:";
		firstAnswer = "wał Campbella";
		secondAnswer = "wał Croscill";
		thirdAnswer = "wał kolczatkę";
		fourthAnswer = "wał strunowy uzębiony";
		correctAnswerNumber = 2;
		image = new Image("/images/image_for_question_1.png");
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Odcinki jelita cienkiego występują w następującej kolejności:";
		firstAnswer = "dwunastnica, okrężnica, jelito ślepe";
		secondAnswer = "jelito ślepe, okrężnica, prostnica";
		thirdAnswer = "dwunastnica, jelito czcze, jelito biodrowe";
		fourthAnswer = "dwunastnica, jelito biodrowe, jelito proste";
		correctAnswerNumber = 3;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Szkodnik przedstawiony na obrazku to:";
		firstAnswer = "mól ziarniak";
		secondAnswer = "wołek zbożowy";
		thirdAnswer = "rozkruszek mączny";
		fourthAnswer = "gnatarz rzepakowiec";
		correctAnswerNumber = 2;
		image = new Image("/images/image_for_question_3.png");
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Na podstawie tabeli wskaż minimalną objętość zbiornika na płynne nawozy naturalne (w przeliczeniu na DJP), dla stajni położonej na obszarze szczególnie narażonym:";
		firstAnswer = "1,5m³";
		secondAnswer = "2,0 m³";
		thirdAnswer = "3,0 m³";
		fourthAnswer = "10,0 m³";
		correctAnswerNumber = 1;
		image = new Image("/images/image_for_question_4.png");
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Zdjęcie przedstawia owcę rasy:";
		firstAnswer = "merynos polski";
		secondAnswer = "berrichon du cher";
		thirdAnswer = "romanowska";
		fourthAnswer = "wrzosówka";
		correctAnswerNumber = 4;
		image = new Image("/images/image_for_question_5.png");
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Jaką powierzchnię pastwiska należy wyznaczyć na jeden dzień wypasu dla 20 szt. krów? " + 
				"Do obliczeń wykorzystaj informacje: " + 
				"Ocena pastwiska metodą analityczną wykazała, że na 1 metrze kwadratowym znajduje się średnio 1,1 kg zielonej masy, w tym niedojady stanowić będą 0,1 kg. Jedna krowa w ciągu dnia pobierze 60 kg zielonki na pastwisku.";
		firstAnswer = "6 arów";
		secondAnswer = "10 arów";
		thirdAnswer = "12 arów";
		fourthAnswer = "60 arów";
		correctAnswerNumber = 3;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Podczas obsługi akumulatora pracownik poparzył się elektrolitem. W pierwszej kolejności oparzone miejsce należy:";
		firstAnswer = "przemyć spirytusem salicylowym";
		secondAnswer = "osuszyć gazą higroskopijną";
		thirdAnswer = "przemyć wodą utlenioną";
		fourthAnswer = "polać obficie zimną wodą";
		correctAnswerNumber = 4;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Po wykonaniu zabiegu ochrony roślin na plantacji rzepaku nastąpiło zatrucie pszczół. Zaistniała sytuacja została spowodowana nieprzestrzeganiem okresu:";
		firstAnswer = "tolerancji";
		secondAnswer = "prewencji";
		thirdAnswer = "karencji";
		fourthAnswer = "wrażliwości";
		correctAnswerNumber = 2;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Przeszkolenie pracownika w zakresie bezpieczeństwa i higieny pracy należy do obowiązków:";
		firstAnswer = "Państwowej Inspekcji Pracy";
		secondAnswer = "Państwowej Inspekcji Sanitarnej";
		thirdAnswer = "Urzędu Pracy";
		fourthAnswer = "Pracodawcy";
		correctAnswerNumber = 4;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Na rysunku powyżej przedstawiono układ kości kończyny miednicznej konia.\nCyfrą 1 oznaczono kość:";
		firstAnswer = "koronową";
		secondAnswer = "kopytową";
		thirdAnswer = "pęcinową";
		fourthAnswer = "śródstopia";
		correctAnswerNumber = 3;
		image = new Image("/images/image_for_question_10.png");
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Trombocyty (składniki morfotyczne krwi) odpowiedzialne są za:";
		firstAnswer = "obronę organizmu przed drobnoustrojami i toksynami";
		secondAnswer = "roznoszenie składników pokarmowych i przeciwciał";
		thirdAnswer = "transport tlenu do komórek i dwutlenku węgla z komórek";
		fourthAnswer = "krzepnięcie krwi i wytworzenie skrzepu na skaleczeniu";
		correctAnswerNumber = 4;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Zespół procesów fizjologicznych zachodzących w układzie rozrodczym samicy między jednym a drugim jajeczkowaniem nazywamy:";
		firstAnswer = "cyklem płciowym";
		secondAnswer = "owulacją";
		thirdAnswer = "jajeczkowaniem";
		fourthAnswer = "ortogenezą";
		correctAnswerNumber = 1;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Na zdjęciu powyżej przedstawiono:";
		firstAnswer = "siewnik rzędowy";
		secondAnswer = "siewnik punktowy";
		thirdAnswer = "agregat uprawowo - siewny";
		fourthAnswer = "rozsiewacz nawozów";
		correctAnswerNumber = 2;
		image = new Image("/images/image_for_question_13.png");
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Jakim kolorem jest oznaczony przewód ochronny przy stosowaniu zerowania?";
		firstAnswer = "czerwonym";
		secondAnswer = "niebieskim";
		thirdAnswer = "brązowym";
		fourthAnswer = "żółto-zielonym";
		correctAnswerNumber = 4;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Rasa kur przedstawiona na obrazku powyżej to:";
		firstAnswer = "Leghorn";
		secondAnswer = "Sussex";
		thirdAnswer = "White rock";
		fourthAnswer = "Plymouth rock";
		correctAnswerNumber = 1;
		image = new Image("/images/image_for_question_15.png");
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Powietrze polarno-kontynentalne napływa:";
		firstAnswer = "znad Oceanu Atlantyckiego";
		secondAnswer = "z Azji i Europy Wschodniej";
		thirdAnswer = "z Grenlandii i Skandynawii";
		fourthAnswer = "znad Azorów";
		correctAnswerNumber = 2;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Temperaturę powietrza w klatce meteorologicznej mierzy się nad poziomem gruntu na wysokości:";
		firstAnswer = "1 m";
		secondAnswer = "2 m";
		thirdAnswer = "3 m";
		fourthAnswer = "4 m";
		correctAnswerNumber = 2;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Urządzenie przedstawione na zdjęciu służy do pomiaru:";
		firstAnswer = "czasu usłonecznienia";
		secondAnswer = "wielkości opadów";
		thirdAnswer = "wilgotności powietrza";
		fourthAnswer = "kierunku i prędkości wiatru";
		correctAnswerNumber = 1;
		image = new Image("/images/image_for_question_18.png");
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Silnie rozwinięte i szybko poruszające się chmury kłębiaste Cumulus (Cumulonimbus), pojawiające się w godzinach popołudniowych latem podczas upalnej pogody, najczęściej zapowiadają";
		firstAnswer = "gwałtowne burze z piorunami";
		secondAnswer = "poranne przymrozki";
		thirdAnswer = "ustabilizowaną pogodę bez opadów";
		fourthAnswer = "mgły adwekcyjne";
		correctAnswerNumber = 1;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Która roślina jest wskazana do rozpoczęcia 4-letniej rotacji w zmianowaniu na glebach lekkich?";
		firstAnswer = "Jęczmień jary";
		secondAnswer = "Pszenica ozima";
		thirdAnswer = "Rzepak ozimy";
		fourthAnswer = "Ziemniaki";
		correctAnswerNumber = 4;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Oblicz cenę jednego kilograma azotu w saletrze amonowej (34%), jeżeli cena 100 kg tego nawozu wynosi 85,00 zł.";
		firstAnswer = "0,25 zł";
		secondAnswer = "0,28 zł";
		thirdAnswer = "2,50 zł";
		fourthAnswer = "2,89 zł";
		correctAnswerNumber = 3;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Przekroczenie dopuszczalnej normy stężenie amoniaku (NH3), znajdującego się w powietrzu, powoduje u zwierząt";
		firstAnswer = "przyspieszony oddech oraz zwiększony pobór pasz";
		secondAnswer = "podrażnienie i zapalenie spojówek i dróg oddechowych";
		thirdAnswer = "niższe zużycie paszy na 1 kg produktu";
		fourthAnswer = "zwiększenie produkcji mleka u samic karmiących";
		correctAnswerNumber = 2;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Zapowiedzią wystąpienia wiosennych przymrozków mogą być:";
		firstAnswer = "wyż w krajach skandynawskich i wiejący silny, północny wiatr";
		secondAnswer = "ciepły front atmosferyczny nad Polską i pojawienie się burz";
		thirdAnswer = "spadek ciśnienia i obfite mgły";
		fourthAnswer = "długotrwałe opady deszczu";
		correctAnswerNumber = 1;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Zaznaczona strzałką pierwsza cyfra (3) oznakowania na jaju konsumpcyjnym wskazuje, że pochodzi z chowu:";
		firstAnswer = "ekologicznego";
		secondAnswer = "wolnowybiegowego";
		thirdAnswer = "ściółkowego";
		fourthAnswer = "klatkowego";
		correctAnswerNumber = 4;
		image = new Image("/images/image_for_question_24.png");
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Elementy morfotyczne krwi powstają";
		firstAnswer = "w mięśniu sercowym";
		secondAnswer = "w czerwonym szpiku kostnym";
		thirdAnswer = "w żółtym szpiku kostnym";
		fourthAnswer = "w części wysepkowej trzustki";
		correctAnswerNumber = 2;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "W uprawie pszenicy ozimej należy przedsiewnie zastosować 20 kg N/ha. Ile należy zastosować kilogramów mocznika (46% N), jeśli powierzchnia zasiewów wynosi 7,5 ha?";
		firstAnswer = "43,5 kg";
		secondAnswer = "69,0 kg";
		thirdAnswer = "163,1 kg";
		fourthAnswer = "326,1 kg";
		correctAnswerNumber = 4;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Przyrząd przedstawiony na ilustracji służy do pomiaru";
		firstAnswer = "wilgotności względnej powietrza";
		secondAnswer = "temperatury ciała zwierząt";
		thirdAnswer = "temperatury gruntu";
		fourthAnswer = "aktualnej temperatury powietrza";
		correctAnswerNumber = 3;
		image = new Image("/images/image_for_question_27.png");
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Mleko pozyskane od krowy leczonej antybiotykiem, dla którego określono 3 dni karencji, można wprowadzić do obrotu";
		firstAnswer = "po trzech dniach od rozpoczęcia leczenia";
		secondAnswer = "po czterech dniach leczenia";
		thirdAnswer = "trzeciego dnia po zakończeniu leczenia";
		fourthAnswer = "czwartego dnia po zakończeniu leczenia";
		correctAnswerNumber = 4;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Układ ustaleniowy kończyn konia umożliwia";
		firstAnswer = "odpoczynek oraz sen w pozycji stojącej";
		secondAnswer = "obronę w sytuacji zagrożenia";
		thirdAnswer = "rozwijanie dużych prędkości w krótkim czasie";
		fourthAnswer = "skracanie i wydłużanie chodów";
		correctAnswerNumber = 1;
		image = null;
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
		
		question = "Chwast przedstawiony na zdjęciu to:";
		firstAnswer = "Przytulia czepna";
		secondAnswer = "Ostrożeń polny";
		thirdAnswer = "Chwastnica jednostronna";
		fourthAnswer = "Skrzyp polny";
		correctAnswerNumber = 4;
		image = new Image("/images/image_for_question_30.png");
		allQuestionsList.add(new QuizQuestion(question, firstAnswer, secondAnswer, 
				thirdAnswer, fourthAnswer, correctAnswerNumber, image));
	}
}
