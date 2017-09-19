To run this test, you will need to specify the environment variables DB\_HOST, DB\_USER, DB\_PASSWORD.
You may optionaly specify DB\_PORT and DB\_NAME

To run the tests from the command line, run
```bash
./gradlew test
```

The tests will fail when Hibernate tries to construct the SessionFactory with `java.lang.IllegalArgumentException: expecting IdClass mapping`.

If you want to see the annotation-based test succeed, you will need to comment out line 34 in `databaseContext.xml` (`<value>hbmMealError.xml</value>`).
This will let the SessionFactory be constructed, and the test will succeed as expected.