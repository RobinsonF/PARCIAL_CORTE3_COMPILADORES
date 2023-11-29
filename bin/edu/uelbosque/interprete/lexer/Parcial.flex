package edu.uelbosque.interprete.lexer;

import java_cup.runtime.Symbol;
import edu.uelbosque.interprete.parser.*;

%%

%class Lexer
%line
%column
%cup
%cupdebug

%implements sym

%standalone


%{ 

  private Symbol sym(int sym) {
    return new Symbol(sym);
  }

  private Symbol sym(int sym, Object val) {
    return new Symbol(sym, val);
  }
  
  public void printData(String type, String text){
	System.out.println("[" + type + ": " + text + "  Line: " + yyline + " Column: " + yycolumn + "]");
  }
%}

Variable = [a-z]+
Numero=[0-9]+

%%

"Model_Name" { printData("MODEL_NAME", yytext()); return sym(MODEL_NAME); }
"Model_Family" { printData("MODEL_FAMILY", yytext()); return sym(MODEL_FAMILY); } 
"Model_Type" { printData("MODEL_TYPE", yytext()); return sym(MODEL_TYPE); }
"Model_Description" { printData("MODEL_DESCRIPTION", yytext()); return sym(MODEL_DESCRIPTION); }
"Inputs" { printData("INPUTS", yytext()); return sym(INPUTS); }
"Input" { printData("INPUT", yytext()); return sym(INPUT); }  
"Input_Name" { printData("INPUT_NAME", yytext()); return sym(INPUT_NAME); }
"Input_Type" { printData("INPUT_TYPE", yytext()); return sym(INPUT_TYPE); }
":" { printData("COLON", yytext()); return sym(COLON); }
"{" { printData("LBRACE", yytext()); return sym(LBRACE); }  
"}" { printData("RBRACE", yytext()); return sym(RBRACE); }
"Outputs" { printData("OUTPUTS", yytext()); return sym(OUTPUTS); }
"Output" { printData("OUTPUT", yytext()); return sym(OUTPUT); }
"Output_Name" { printData("OUTPUT_NAME", yytext()); return sym(OUTPUT_NAME); }
"Output_Type" { printData("OUTPUT_TYPE", yytext()); return sym(OUTPUT_TYPE); }  
"," { printData("COMMA", yytext()); return sym(COMMA); }
"CATEGORICAL" {printData("CATEGORICAL", yytext()); return sym(CATEGORICAL); }  
{Numero} { printData("NUMERO", yytext()); return sym(NUMBER, yytext());} 
"BINARY" {printData("BINARY", yytext()); return sym(BINARY); }
"ANN" {printData("ANN", yytext()); return sym(ANN); }
"Tree" {printData("TREE", yytext()); return sym(TREE); }  
"RandomForest" {printData("RANDOMFOREST", yytext()); return sym(RANDOMFOREST); }
"SVM" {printData("SVM", yytext()); return sym(SVM); }  
"DecisionTree" {printData("DECISIONTREE", yytext()); return sym(DECISIONTREE); }
"CLASSIFIER" {printData("CLASSIFIER", yytext()); return sym(CLASSIFIER); }  
"REGRESSION" {printData("REGRESSION", yytext()); return sym(REGRESSION); }
"CLUSTERING" {printData("CLUSTERING", yytext()); return sym(CLUSTERING); }  
"Model" {printData("MODEL", yytext()); return sym(MODEL); }  
"Layers" {printData("LAYERS", yytext()); return sym(LAYERS); }  
"Layer" {printData("LAYER", yytext()); return sym(LAYER); }  
"Layer_Name" {printData("LAYER_NAME", yytext()); return sym(LAYER_NAME); }  
"Layer_Params" {printData("LAYER_PARAMS", yytext()); return sym(LAYER_PARAMS); }  
{Variable} { printData("VARIABLE", yytext()); return sym(FREETEXT, yytext());}
"[" {printData("LBRACKET", yytext()); return sym(LBRACKET); }  
"]" {printData("RBRACKET", yytext()); return sym(RBRACKET); }
[\ \t\b\f\r\n]+ { /* eat whitespace */ }
"//"[^\n]*      { /* one-line comment */ }
.               { throw new Error("Unexpected character ["+yytext()+"]"); }
