package analisador_lexico;

import java.util.HashMap;
import java.util.Map;

public class SymbolsTable {
    public enum TypeMiniPascal {
        INTEGER,
        STRING,
        FLOAT,
        BOOLEAN,
        INVALID
    }

    class SymbolTableEntry {
        String name;
        TypeMiniPascal type;

        private SymbolTableEntry(String name, TypeMiniPascal type) {
            this.name = name;
            this.type = type;
        }
    }

    private final Map<String, SymbolTableEntry> table;

    public SymbolsTable() {
        this.table = new HashMap<>();
    }

    public void add(String name, TypeMiniPascal type) {
        table.put(name, new SymbolTableEntry(name, type));
    }

    public boolean exist(String name) {
        return table.containsKey(name);
    }

    public TypeMiniPascal verify(String name) {
        return table.get(name).type;
    }
}
