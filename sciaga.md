# Uzyteczne Adnotacje

## Spring - pospolite

- *@SpringBootApplication* - główna adnotacja którą stosujemy nad klasą aplikacji, dostarcza dodatkowo z automatu adnotacji : *@Configuration*, *@ComponentScan* oraz *@EnableAutoConfiguration*
- *@Configuration* - adnotacja ktorą stosujemy nad klasą, dostarcza możliwości konfiguracji przy pomocy adnotacji nad nią (na przyklad adnotacja *@EnableCaching*) oraz pozwala tworzyć bean'y przy pomocy adnotacji *@Bean*
- *@Bean* - adnotacja którą stosujemy nad metodami w klasie oznaczonej przy pomocy *@Configuration*, rejestruje ona obiekt zwracany przez metodę jako bean w kontekście Spring'a
- *@Component* - adnotacja którą stosujemy nad klasą, pozwala Spring'owi stworzyć obiekt klasy i zarejestrować go w swoim kontekście
- *@Scope* - adnotacja której możemy użyć wraz z adnotacją *@Bean* bądź *@Component*, pozawla ona sprecyzować scope bean'u
- *@Autowired* - adnotacja oznaczjąca dany argument albo parametr klasy jako możliwy do wstrzyknięcia. Może być użyta bezpośrednio nad argumentem klasy, konstruktorem albo setterem
- *@Qualifier* - adnotacja pozwalająca sprecyzować nazwę beanu który chcemy wstrzyknąć w dane miejsce
- *@PostConstruct* - adnotacja uzywana nad metodą która ma się wywołać po stworzeniu beanu (wszystkie zależności w tym momencie są rozwiązane)
- *@PreDestroy* - adnotacja uzywana nad metodą która ma się wywołać przed zniszczeniem (wyrzuceniem) bean'u z kontekstu Spring'a

## Spring - warunkowe
- *@Profile* - uzywana nad klasą, pozwala określić przy jakim profilu (albo braku) bean ma zostać tworzony
- *@Primary* - używana nad deklaracją bean'u, określa bean jako główny (preferowany), w przypadku wystąpienia konfliktu 2 beanów ten oznaczony jako *@Primary* zostanie użyty
