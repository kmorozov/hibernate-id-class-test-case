# Setup

To run this test, you will need to specify the environment variables DB\_HOST, DB\_USER, DB\_PASSWORD.
You may optionaly specify DB\_PORT and DB\_NAME

To run the tests from the command line, run
```bash
./gradlew test
```

# Test Explanations
### saveMeal
Tries to save an entity (`Meal.java`) with a composite key. The entity mapping is defined in `hbmMealError.xml`.

### saveAnnotatedMeal
Tries to save an entity (`AnnotatedMeal.java`) with a composite key. The entity mapping is defined in the java file using jpa annotations.

The tests will fail when Hibernate tries to construct the SessionFactory with `java.lang.IllegalArgumentException: expecting IdClass mapping`.

If you want to see the annotation-based test succeed, you will need to comment out line 34 in `databaseContext.xml` (`<value>hbmMealError.xml</value>`).
This will let the SessionFactory be constructed, and the test will succeed as expected.