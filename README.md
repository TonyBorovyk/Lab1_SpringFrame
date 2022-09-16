# Lab1_SpringFrame
# 1. В чому полягає різниця між Spring Framework та Spring Boot?
  Spring Framework – це фреймворк що застосовується для розробки ентерпрайз застосунків.
  Spring Boot – це технологія яка дозволяє конфігурувати Spring Framework.
  Spring Framework використовує XML-конфігурацію, а Spring Boot java анотації і не потребує XML-конфігурації.
  За допомогою Spring Boot значно знижується час розробки застосунку. 
  Особливістю Spring Boot є автоконфігурація.
  Spring Boot дуже просто запускається та налаштовується.

# 2. Для чого в структурі проекту потрібен файл pom.xml?
  У файлі pom.xml прописані залежності проекту.
  
# 3. Для чого потрібна анотація @SpringBootApplication? Що буде, якщо її прибрати?
  Анотація @SpringBootApplication включає автоконфігурації, сканування компонентів і конфігурацію Spring Boot.
  Якщо її не буде, то спрінг запуститься без конфігурацій.

# 4. Для чого потрібен інтерфейс CommandLineRunner? 
  CommandLineRunner використовується для запуску коду під час запуску програми.
# 5. Чим інтерфейс CommandLineRunner відрізняється від ApplicationRunner?
  Відмінність між CommandLineRunner і ApplicationRunner полягає в тому, що CommandLineRunner приймає масив 
  String як аргумент методу run(), а ApplicationRunner приймає spring ApplicationArguments як аргумент.
# 6. Використовуючи анотацію @Component додайте в перший проект два біна First та Second з інтерфейсом CommandLineRunner, які виводять на консоль слова "First" та "Second" відповідно. За допомогою анотації @Order зробіть так, щоб рядки на консоль виводились у наступному порядку: