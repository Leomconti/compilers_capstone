/* Compiler.java */
/* Generated By:JavaCC: Do not edit this line. Compiler.java */
package com.example.compiler_testes;


public class Compiler implements CompilerConstants {
    public static void main(String[] args) {
        // Test the lexer here

    }

  final public void programa() throws ParseException {
    jj_consume_token(DO);
    jj_consume_token(THIS);
    jj_consume_token(IDENTIFICADOR);
    jj_consume_token(OPEN_BRACKET);
    jj_consume_token(CLOSE_BRACKET);
    combinedEnumAndConst();
    jj_consume_token(BODY);
    jj_consume_token(OPEN_BRACKET);
    listaComandos();
    jj_consume_token(CLOSE_BRACKET);
    finalPrograma();
}

  final public void finalPrograma() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case DESCRIPTION:{
      jj_consume_token(DESCRIPTION);
      jj_consume_token(LITERAL);
      break;
      }
    default:
      jj_la1[0] = jj_gen;
      ;
    }
}

  final public void combinedEnumAndConst() throws ParseException {
    jj_consume_token(DECLARATION);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TYPE:{
      enumeradoeouVars();
      break;
      }
    case CONSTANT:{
      constAndVarsOnly();
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void enumeradoeouVars() throws ParseException {
    jj_consume_token(TYPE);
    jj_consume_token(OPEN_BRACKET);
    listaIs();
    jj_consume_token(CLOSE_BRACKET);
    jj_consume_token(DOT);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case DECLARATION:{
      jj_consume_token(DECLARATION);
      constAndVarsOnly();
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      ;
    }
}

  final public void constAndVarsOnly() throws ParseException {
    jj_consume_token(CONSTANT);
    jj_consume_token(AND);
    jj_consume_token(VARIABLE);
    jj_consume_token(OPEN_BRACKET);
    cV();
    jj_consume_token(CLOSE_BRACKET);
    jj_consume_token(DOT);
}

  final public void atribuicao() throws ParseException {
    jj_consume_token(DESIGNATE);
    jj_consume_token(THIS);
    listaIdent();
    jj_consume_token(AS);
    expressao();
}

  final public void saida() throws ParseException {
    jj_consume_token(WRITE);
    jj_consume_token(OPEN_BRACKET);
    listaIdentConst();
    jj_consume_token(CLOSE_BRACKET);
    jj_consume_token(DOT);
}

  final public void write() throws ParseException {
    jj_consume_token(WRITE);
    write_();
}

  final public void write_() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ALL:{
      jj_consume_token(ALL);
      jj_consume_token(THIS);
      break;
      }
    case THIS:{
      jj_consume_token(THIS);
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void entrada() throws ParseException {
    jj_consume_token(READ);
    jj_consume_token(THIS);
    jj_consume_token(OPEN_BRACKET);
    listaIdent();
    jj_consume_token(CLOSE_BRACKET);
    jj_consume_token(DOT);
}

  final public void selecao() throws ParseException {
    jj_consume_token(AVALIATE);
    jj_consume_token(THIS);
    expressao();
    jj_consume_token(TRUE);
    jj_consume_token(RESULT);
    jj_consume_token(OPEN_BRACKET);
    listaComandos();
    jj_consume_token(CLOSE_BRACKET);
    jj_consume_token(UNTRUE);
    jj_consume_token(RESULT);
    jj_consume_token(OPEN_BRACKET);
    listaComandos();
    jj_consume_token(CLOSE_BRACKET);
}

  final public void comandos() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case DESIGNATE:{
      atribuicao();
      break;
      }
    case READ:{
      entrada();
      break;
      }
    case WRITE:{
      saida();
      break;
      }
    case AVALIATE:{
      selecao();
      break;
      }
    case REPEAT:{
      repeticao();
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void listaComandos() throws ParseException {
    comandos();
    comCont();
}

  final public void comCont() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case AVALIATE:
    case DESIGNATE:
    case READ:
    case WRITE:
    case REPEAT:{
      listaComandos();
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      ;
    }
}

  final public void asC() throws ParseException {
    listaIdent();
    jj_consume_token(IS);
    tipoC();
    jj_consume_token(EQUALS);
    valor();
}

  final public void asV() throws ParseException {
    listaIdent();
    jj_consume_token(IS);
    tipoV();
}

  final public void tipoC() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTEGER_DEF:{
      jj_consume_token(INTEGER_DEF);
      break;
      }
    case REAL_DEF:{
      jj_consume_token(REAL_DEF);
      break;
      }
    case LITERAL_DEF:{
      jj_consume_token(LITERAL_DEF);
      break;
      }
    case LOGIC_DEF:{
      jj_consume_token(LOGIC_DEF);
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void tipoV() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTEGER_DEF:{
      jj_consume_token(INTEGER_DEF);
      break;
      }
    case REAL_DEF:{
      jj_consume_token(REAL_DEF);
      break;
      }
    case LITERAL_DEF:{
      jj_consume_token(LITERAL_DEF);
      break;
      }
    case LOGIC_DEF:{
      jj_consume_token(LOGIC_DEF);
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void valor() throws ParseException {
    jj_consume_token(CONSTANT);
    valor_();
}

  final public void valor_() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTEGER_DEF:{
      jj_consume_token(INTEGER_DEF);
      break;
      }
    case REAL_DEF:{
      jj_consume_token(REAL_DEF);
      break;
      }
    case LITERAL_DEF:{
      jj_consume_token(LITERAL_DEF);
      break;
      }
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void listaIdentsC() throws ParseException {
    jj_consume_token(IDENTIFICADOR);
    identCont();
}

  final public void identCont() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case COMMA:{
      jj_consume_token(COMMA);
      listaIdentsC();
      break;
      }
    default:
      jj_la1[9] = jj_gen;
      ;
    }
}

  final public void listaIdent() throws ParseException {
    jj_consume_token(IDENTIFICADOR);
    tId();
    contId();
}

  final public void tId() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OPEN_BRACE:{
      jj_consume_token(OPEN_BRACE);
      jj_consume_token(CONSTANT);
      jj_consume_token(INTEGER_DEF);
      jj_consume_token(CLOSE_BRACE);
      break;
      }
    default:
      jj_la1[10] = jj_gen;
      ;
    }
}

  final public void contId() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFICADOR:{
      listaIdent();
      break;
      }
    default:
      jj_la1[11] = jj_gen;
      ;
    }
}

  final public void listaIdentConst() throws ParseException {
    listaIdentConstI();
    jj_consume_token(DOT);
    iCCont();
}

  final public void listaIdentConstI() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFICADOR:{
      listaIdent();
      break;
      }
    case CONSTANT:{
      jj_consume_token(CONSTANT);
      break;
      }
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void iCCont() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFICADOR:
    case CONSTANT:{
      listaIdentConst();
      break;
      }
    default:
      jj_la1[13] = jj_gen;
      ;
    }
}

  final public void listaIs() throws ParseException {
    jj_consume_token(IDENTIFICADOR);
    jj_consume_token(IS);
    jj_consume_token(OPEN_BRACE);
    listaIdent();
    jj_consume_token(CLOSE_BRACE);
    isCont();
}

  final public void isCont() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFICADOR:{
      listaIs();
      break;
      }
    default:
      jj_la1[14] = jj_gen;
      ;
    }
}

  final public void repeticao() throws ParseException {
    jj_consume_token(REPEAT);
    jj_consume_token(THIS);
    expressao();
    jj_consume_token(OPEN_BRACKET);
    listaComandos();
    jj_consume_token(CLOSE_BRACKET);
}

  final public void cV() throws ParseException {
    jj_consume_token(AS);
    cV_();
}

  final public void cV_() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case CONSTANT:{
      jj_consume_token(CONSTANT);
      asC();
      contCV();
      break;
      }
    case VARIABLE:{
      jj_consume_token(VARIABLE);
      asV();
      break;
      }
    default:
      jj_la1[15] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void contCV() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case AS:{
      jj_consume_token(AS);
      jj_consume_token(VARIABLE);
      asV();
      break;
      }
    default:
      jj_la1[16] = jj_gen;
      ;
    }
}

  final public void expressao() throws ParseException {
    expressaoAritOuLogica();
    expressao_();
}

// the [] means that the token is optional, sooo, it's basically the OR Episolon
  final public void expressao_() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LESS_THAN:
    case LESS_THAN_EQUAL:
    case GREATER_THAN_EQUAL:
    case GREATER_THAN:
    case EQUAL:
    case NOT_EQUAL:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case EQUAL:{
        jj_consume_token(EQUAL);
        expressaoAritOuLogica();
        break;
        }
      case NOT_EQUAL:{
        jj_consume_token(NOT_EQUAL);
        expressaoAritOuLogica();
        break;
        }
      case LESS_THAN:{
        jj_consume_token(LESS_THAN);
        expressaoAritOuLogica();
        break;
        }
      case GREATER_THAN:{
        jj_consume_token(GREATER_THAN);
        expressaoAritOuLogica();
        break;
        }
      case LESS_THAN_EQUAL:{
        jj_consume_token(LESS_THAN_EQUAL);
        expressaoAritOuLogica();
        break;
        }
      case GREATER_THAN_EQUAL:{
        jj_consume_token(GREATER_THAN_EQUAL);
        expressaoAritOuLogica();
        break;
        }
      default:
        jj_la1[17] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[18] = jj_gen;
      ;
    }
}

  final public void expressaoAritOuLogica() throws ParseException {
    termo2();
    menorPrioridade();
}

  final public void menorPrioridade() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case PLUS:
    case MINUS:
    case OR_LOGIC:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:{
        jj_consume_token(PLUS);
        termo2();
        menorPrioridade();
        break;
        }
      case MINUS:{
        jj_consume_token(MINUS);
        termo2();
        menorPrioridade();
        break;
        }
      case OR_LOGIC:{
        jj_consume_token(OR_LOGIC);
        termo2();
        menorPrioridade();
        break;
        }
      default:
        jj_la1[19] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[20] = jj_gen;
      ;
    }
}

  final public void termo2() throws ParseException {
    termo1();
    mediaPrioridade();
}

  final public void mediaPrioridade() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MULTIPLY:{
      jj_consume_token(MULTIPLY);
      termo1();
      mediaPrioridade();
      break;
      }
    case DIVIDE:{
      jj_consume_token(DIVIDE);
      termo1();
      mediaPrioridade();
      break;
      }
    case MODULO:{
      jj_consume_token(MODULO);
      termo1();
      mediaPrioridade();
      break;
      }
    case AND:{
      jj_consume_token(AND);
      termo1();
      mediaPrioridade();
      break;
      }
    case OR_LOGIC:{
      jj_consume_token(OR_LOGIC);
      termo1();
      mediaPrioridade();
      break;
      }
    default:
      jj_la1[21] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void termo1() throws ParseException {
    elemento();
    maiorPrioridade();
}

  final public void maiorPrioridade() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case POWER:{
      jj_consume_token(POWER);
      elemento();
      maiorPrioridade();
      break;
      }
    default:
      jj_la1[22] = jj_gen;
      ;
    }
}

  final public void elemento() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFICADOR:{
      jj_consume_token(IDENTIFICADOR);
      indice();
      break;
      }
    case INTEGER:{
      jj_consume_token(INTEGER);
      break;
      }
    case REAL:{
      jj_consume_token(REAL);
      break;
      }
    case LITERAL:{
      jj_consume_token(LITERAL);
      break;
      }
    case TRUE:{
      jj_consume_token(TRUE);
      break;
      }
    case UNTRUE:{
      jj_consume_token(UNTRUE);
      break;
      }
    case OPEN_PAREN:{
      jj_consume_token(OPEN_PAREN);
      expressao();
      jj_consume_token(CLOSE_PAREN);
      break;
      }
    case NOT_LOGIC:{
      jj_consume_token(NOT_LOGIC);
      jj_consume_token(OPEN_PAREN);
      expressao();
      jj_consume_token(CLOSE_PAREN);
      break;
      }
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void indice() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OPEN_BRACE:{
      jj_consume_token(OPEN_BRACE);
      expressao();
      jj_consume_token(CLOSE_BRACE);
      break;
      }
    default:
      jj_la1[24] = jj_gen;
      ;
    }
}

  /** Generated Token Manager. */
  public CompilerTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[25];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	   jj_la1_init_2();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x20000,0x280000,0x40000,0x10008000,0x2d002000,0x2d002000,0xc0000000,0xc0000000,0xc0000000,0x0,0x0,0x800,0x200800,0x200800,0x800,0xa00000,0x2000000,0x0,0x0,0x0,0x0,0x400000,0x0,0x800,0x0,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x3,0x3,0x1,0x8000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0xfc000,0xfc000,0x200180,0x200180,0x201600,0x800,0x240007c,0x0,};
	}
	private static void jj_la1_init_2() {
	   jj_la1_2 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x40,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x40,};
	}

  /** Constructor with InputStream. */
  public Compiler(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Compiler(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new CompilerTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Compiler(java.io.Reader stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new CompilerTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new CompilerTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Compiler(CompilerTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(CompilerTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 25; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[94];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 25; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		   if ((jj_la1_2[i] & (1<<j)) != 0) {
			 la1tokens[64+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 94; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
