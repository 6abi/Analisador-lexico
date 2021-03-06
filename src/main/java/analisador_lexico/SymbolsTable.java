package analisador_lexico;

import java.util.HashMap;
import java.util.Map;

//tipos dos dados
public class SymbolsTable {
    public enum TypeMiniPascal {
        INTEGER,
        STRING,
        FLOAT,
        BOOLEAN,
        INVALID
    }
//estrutura da tabela de simbolos: nome e tipo
    class SymbolTableEntry {
        String name;
        TypeMiniPascal type;

        private SymbolTableEntry(String name, TypeMiniPascal type) {
            this.name = name;
            this.type = type;
        }
    }
//Mapa
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
