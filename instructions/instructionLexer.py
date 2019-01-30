# Generated from instruction.g4 by ANTLR 4.7.1
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23")
        buf.write("c\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\3\2\3\2")
        buf.write("\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3")
        buf.write("\t\3\n\3\n\3\13\6\139\n\13\r\13\16\13:\3\13\3\13\3\f\3")
        buf.write("\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3")
        buf.write("\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20")
        buf.write("\3\21\3\21\3\21\3\21\3\21\3\22\3\22\7\22_\n\22\f\22\16")
        buf.write("\22b\13\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23")
        buf.write("\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\5\5")
        buf.write("\2\13\f\17\17\"\"\4\2C\\c|\6\2\62;C\\aac|\2d\2\3\3\2\2")
        buf.write("\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2")
        buf.write("\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25")
        buf.write("\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3")
        buf.write("\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5")
        buf.write("\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2")
        buf.write("\2\17\61\3\2\2\2\21\63\3\2\2\2\23\65\3\2\2\2\258\3\2\2")
        buf.write("\2\27>\3\2\2\2\31E\3\2\2\2\33J\3\2\2\2\35O\3\2\2\2\37")
        buf.write("S\3\2\2\2!W\3\2\2\2#\\\3\2\2\2%&\7.\2\2&\4\3\2\2\2\'(")
        buf.write("\7<\2\2(\6\3\2\2\2)*\7*\2\2*\b\3\2\2\2+,\7+\2\2,\n\3\2")
        buf.write("\2\2-.\7?\2\2.\f\3\2\2\2/\60\7-\2\2\60\16\3\2\2\2\61\62")
        buf.write("\7/\2\2\62\20\3\2\2\2\63\64\7,\2\2\64\22\3\2\2\2\65\66")
        buf.write("\7\61\2\2\66\24\3\2\2\2\679\t\2\2\28\67\3\2\2\29:\3\2")
        buf.write("\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\b\13\2\2=\26\3\2")
        buf.write("\2\2>?\7t\2\2?@\7g\2\2@A\7n\2\2AB\7a\2\2BC\7q\2\2CD\7")
        buf.write("r\2\2D\30\3\2\2\2EF\7O\2\2FG\7w\2\2GH\7z\2\2HI\7\65\2")
        buf.write("\2I\32\3\2\2\2JK\7O\2\2KL\7w\2\2LM\7z\2\2MN\7\64\2\2N")
        buf.write("\34\3\2\2\2OP\7Q\2\2PQ\7r\2\2QR\7v\2\2R\36\3\2\2\2ST\7")
        buf.write("E\2\2TU\7*\2\2UV\7+\2\2V \3\2\2\2WX\7V\2\2XY\7t\2\2YZ")
        buf.write("\7w\2\2Z[\7g\2\2[\"\3\2\2\2\\`\t\3\2\2]_\t\4\2\2^]\3\2")
        buf.write("\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a$\3\2\2\2b`\3\2\2\2")
        buf.write("\5\2:`\3\2\3\2")
        return buf.getvalue()


class instructionLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    T__5 = 6
    T__6 = 7
    T__7 = 8
    T__8 = 9
    WS = 10
    RELOP = 11
    MUX3 = 12
    MUX2 = 13
    OPT = 14
    CONSTANT = 15
    TRUE = 16
    ID = 17

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "','", "':'", "'('", "')'", "'='", "'+'", "'-'", "'*'", "'/'", 
            "'rel_op'", "'Mux3'", "'Mux2'", "'Opt'", "'C()'", "'True'" ]

    symbolicNames = [ "<INVALID>",
            "WS", "RELOP", "MUX3", "MUX2", "OPT", "CONSTANT", "TRUE", "ID" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "T__8", "WS", "RELOP", "MUX3", "MUX2", "OPT", 
                  "CONSTANT", "TRUE", "ID" ]

    grammarFileName = "instruction.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


