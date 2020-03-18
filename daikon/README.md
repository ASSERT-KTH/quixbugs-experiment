### Invariant detection with DaiKon


#### All trace file and detected invariant are vailable in the 'data' folder

#### How to use Daikon

Run the program under the control of DynComp to generate comparability information
```
java -cp ./target/classes:$DAIKONDIR/daikon.jar daikon.DynComp java_programs.MERGESORT

```

##### Daikon infers invariants
```

java -cp ./target/classes:$DAIKONDIR/daikon.jar daikon.Chicory --daikon \
                    --comparability-file=MERGESORT.decls-DynComp \
                    java_programs.MERGESORT
```

##### Invariant detection
```
java -cp $DAIKONDIR/daikon.jar daikon.Daikon MERGESORT.dtrace.gz

```
