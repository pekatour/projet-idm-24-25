package xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.services.SchemaTableGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSchemaTableParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Table'", "'{'", "'colonnes'", "','", "'}'", "'contraintes'", "'c'", "'Algorithme'", "'ressource'", "'documentation'", "'langage'", "'entree'", "'sortie'", "'c_deriv'", "'algo'", "'c_etr'", "'id'", "'from'", "'c_id'", "'PYTHON'", "'INTERNE'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSchemaTableParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSchemaTableParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSchemaTableParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSchemaTable.g"; }



     	private SchemaTableGrammarAccess grammarAccess;

        public InternalSchemaTableParser(TokenStream input, SchemaTableGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Table";
       	}

       	@Override
       	protected SchemaTableGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTable"
    // InternalSchemaTable.g:65:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSchemaTable.g:65:46: (iv_ruleTable= ruleTable EOF )
            // InternalSchemaTable.g:66:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalSchemaTable.g:72:1: ruleTable returns [EObject current=null] : (otherlv_0= 'Table' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'colonnes' otherlv_4= '{' ( (lv_colonneData_5_0= ruleColonne ) ) (otherlv_6= ',' ( (lv_colonneData_7_0= ruleColonne ) ) )* otherlv_8= '}' (otherlv_9= 'contraintes' otherlv_10= '{' ( (lv_algoContrainte_11_0= ruleAlgorithme ) ) (otherlv_12= ',' ( (lv_algoContrainte_13_0= ruleAlgorithme ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_nom_1_0 = null;

        EObject lv_colonneData_5_0 = null;

        EObject lv_colonneData_7_0 = null;

        EObject lv_algoContrainte_11_0 = null;

        EObject lv_algoContrainte_13_0 = null;



        	enterRule();

        try {
            // InternalSchemaTable.g:78:2: ( (otherlv_0= 'Table' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'colonnes' otherlv_4= '{' ( (lv_colonneData_5_0= ruleColonne ) ) (otherlv_6= ',' ( (lv_colonneData_7_0= ruleColonne ) ) )* otherlv_8= '}' (otherlv_9= 'contraintes' otherlv_10= '{' ( (lv_algoContrainte_11_0= ruleAlgorithme ) ) (otherlv_12= ',' ( (lv_algoContrainte_13_0= ruleAlgorithme ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalSchemaTable.g:79:2: (otherlv_0= 'Table' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'colonnes' otherlv_4= '{' ( (lv_colonneData_5_0= ruleColonne ) ) (otherlv_6= ',' ( (lv_colonneData_7_0= ruleColonne ) ) )* otherlv_8= '}' (otherlv_9= 'contraintes' otherlv_10= '{' ( (lv_algoContrainte_11_0= ruleAlgorithme ) ) (otherlv_12= ',' ( (lv_algoContrainte_13_0= ruleAlgorithme ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalSchemaTable.g:79:2: (otherlv_0= 'Table' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'colonnes' otherlv_4= '{' ( (lv_colonneData_5_0= ruleColonne ) ) (otherlv_6= ',' ( (lv_colonneData_7_0= ruleColonne ) ) )* otherlv_8= '}' (otherlv_9= 'contraintes' otherlv_10= '{' ( (lv_algoContrainte_11_0= ruleAlgorithme ) ) (otherlv_12= ',' ( (lv_algoContrainte_13_0= ruleAlgorithme ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalSchemaTable.g:80:3: otherlv_0= 'Table' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'colonnes' otherlv_4= '{' ( (lv_colonneData_5_0= ruleColonne ) ) (otherlv_6= ',' ( (lv_colonneData_7_0= ruleColonne ) ) )* otherlv_8= '}' (otherlv_9= 'contraintes' otherlv_10= '{' ( (lv_algoContrainte_11_0= ruleAlgorithme ) ) (otherlv_12= ',' ( (lv_algoContrainte_13_0= ruleAlgorithme ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
            		
            // InternalSchemaTable.g:84:3: ( (lv_nom_1_0= ruleEString ) )
            // InternalSchemaTable.g:85:4: (lv_nom_1_0= ruleEString )
            {
            // InternalSchemaTable.g:85:4: (lv_nom_1_0= ruleEString )
            // InternalSchemaTable.g:86:5: lv_nom_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNomEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_nom_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"xtext.SchemaTable.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getTableAccess().getColonnesKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSchemaTable.g:115:3: ( (lv_colonneData_5_0= ruleColonne ) )
            // InternalSchemaTable.g:116:4: (lv_colonneData_5_0= ruleColonne )
            {
            // InternalSchemaTable.g:116:4: (lv_colonneData_5_0= ruleColonne )
            // InternalSchemaTable.g:117:5: lv_colonneData_5_0= ruleColonne
            {

            					newCompositeNode(grammarAccess.getTableAccess().getColonneDataColonneParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_colonneData_5_0=ruleColonne();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					add(
            						current,
            						"colonneData",
            						lv_colonneData_5_0,
            						"xtext.SchemaTable.Colonne");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSchemaTable.g:134:3: (otherlv_6= ',' ( (lv_colonneData_7_0= ruleColonne ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSchemaTable.g:135:4: otherlv_6= ',' ( (lv_colonneData_7_0= ruleColonne ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getTableAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSchemaTable.g:139:4: ( (lv_colonneData_7_0= ruleColonne ) )
            	    // InternalSchemaTable.g:140:5: (lv_colonneData_7_0= ruleColonne )
            	    {
            	    // InternalSchemaTable.g:140:5: (lv_colonneData_7_0= ruleColonne )
            	    // InternalSchemaTable.g:141:6: lv_colonneData_7_0= ruleColonne
            	    {

            	    						newCompositeNode(grammarAccess.getTableAccess().getColonneDataColonneParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_colonneData_7_0=ruleColonne();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"colonneData",
            	    							lv_colonneData_7_0,
            	    							"xtext.SchemaTable.Colonne");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalSchemaTable.g:163:3: (otherlv_9= 'contraintes' otherlv_10= '{' ( (lv_algoContrainte_11_0= ruleAlgorithme ) ) (otherlv_12= ',' ( (lv_algoContrainte_13_0= ruleAlgorithme ) ) )* otherlv_14= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSchemaTable.g:164:4: otherlv_9= 'contraintes' otherlv_10= '{' ( (lv_algoContrainte_11_0= ruleAlgorithme ) ) (otherlv_12= ',' ( (lv_algoContrainte_13_0= ruleAlgorithme ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getTableAccess().getContraintesKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalSchemaTable.g:172:4: ( (lv_algoContrainte_11_0= ruleAlgorithme ) )
                    // InternalSchemaTable.g:173:5: (lv_algoContrainte_11_0= ruleAlgorithme )
                    {
                    // InternalSchemaTable.g:173:5: (lv_algoContrainte_11_0= ruleAlgorithme )
                    // InternalSchemaTable.g:174:6: lv_algoContrainte_11_0= ruleAlgorithme
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getAlgoContrainteAlgorithmeParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_algoContrainte_11_0=ruleAlgorithme();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						add(
                    							current,
                    							"algoContrainte",
                    							lv_algoContrainte_11_0,
                    							"xtext.SchemaTable.Algorithme");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSchemaTable.g:191:4: (otherlv_12= ',' ( (lv_algoContrainte_13_0= ruleAlgorithme ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalSchemaTable.g:192:5: otherlv_12= ',' ( (lv_algoContrainte_13_0= ruleAlgorithme ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getTableAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalSchemaTable.g:196:5: ( (lv_algoContrainte_13_0= ruleAlgorithme ) )
                    	    // InternalSchemaTable.g:197:6: (lv_algoContrainte_13_0= ruleAlgorithme )
                    	    {
                    	    // InternalSchemaTable.g:197:6: (lv_algoContrainte_13_0= ruleAlgorithme )
                    	    // InternalSchemaTable.g:198:7: lv_algoContrainte_13_0= ruleAlgorithme
                    	    {

                    	    							newCompositeNode(grammarAccess.getTableAccess().getAlgoContrainteAlgorithmeParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_algoContrainte_13_0=ruleAlgorithme();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"algoContrainte",
                    	    								lv_algoContrainte_13_0,
                    	    								"xtext.SchemaTable.Algorithme");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColonne"
    // InternalSchemaTable.g:229:1: entryRuleColonne returns [EObject current=null] : iv_ruleColonne= ruleColonne EOF ;
    public final EObject entryRuleColonne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColonne = null;


        try {
            // InternalSchemaTable.g:229:48: (iv_ruleColonne= ruleColonne EOF )
            // InternalSchemaTable.g:230:2: iv_ruleColonne= ruleColonne EOF
            {
             newCompositeNode(grammarAccess.getColonneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColonne=ruleColonne();

            state._fsp--;

             current =iv_ruleColonne; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColonne"


    // $ANTLR start "ruleColonne"
    // InternalSchemaTable.g:236:1: ruleColonne returns [EObject current=null] : (this_Colonne_Impl_0= ruleColonne_Impl | this_ColonneDerivee_1= ruleColonneDerivee | this_ColonneEtrangere_2= ruleColonneEtrangere | this_ColonneIdentifiants_3= ruleColonneIdentifiants ) ;
    public final EObject ruleColonne() throws RecognitionException {
        EObject current = null;

        EObject this_Colonne_Impl_0 = null;

        EObject this_ColonneDerivee_1 = null;

        EObject this_ColonneEtrangere_2 = null;

        EObject this_ColonneIdentifiants_3 = null;



        	enterRule();

        try {
            // InternalSchemaTable.g:242:2: ( (this_Colonne_Impl_0= ruleColonne_Impl | this_ColonneDerivee_1= ruleColonneDerivee | this_ColonneEtrangere_2= ruleColonneEtrangere | this_ColonneIdentifiants_3= ruleColonneIdentifiants ) )
            // InternalSchemaTable.g:243:2: (this_Colonne_Impl_0= ruleColonne_Impl | this_ColonneDerivee_1= ruleColonneDerivee | this_ColonneEtrangere_2= ruleColonneEtrangere | this_ColonneIdentifiants_3= ruleColonneIdentifiants )
            {
            // InternalSchemaTable.g:243:2: (this_Colonne_Impl_0= ruleColonne_Impl | this_ColonneDerivee_1= ruleColonneDerivee | this_ColonneEtrangere_2= ruleColonneEtrangere | this_ColonneIdentifiants_3= ruleColonneIdentifiants )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            case 29:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSchemaTable.g:244:3: this_Colonne_Impl_0= ruleColonne_Impl
                    {

                    			newCompositeNode(grammarAccess.getColonneAccess().getColonne_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Colonne_Impl_0=ruleColonne_Impl();

                    state._fsp--;


                    			current = this_Colonne_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSchemaTable.g:253:3: this_ColonneDerivee_1= ruleColonneDerivee
                    {

                    			newCompositeNode(grammarAccess.getColonneAccess().getColonneDeriveeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColonneDerivee_1=ruleColonneDerivee();

                    state._fsp--;


                    			current = this_ColonneDerivee_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSchemaTable.g:262:3: this_ColonneEtrangere_2= ruleColonneEtrangere
                    {

                    			newCompositeNode(grammarAccess.getColonneAccess().getColonneEtrangereParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColonneEtrangere_2=ruleColonneEtrangere();

                    state._fsp--;


                    			current = this_ColonneEtrangere_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSchemaTable.g:271:3: this_ColonneIdentifiants_3= ruleColonneIdentifiants
                    {

                    			newCompositeNode(grammarAccess.getColonneAccess().getColonneIdentifiantsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColonneIdentifiants_3=ruleColonneIdentifiants();

                    state._fsp--;


                    			current = this_ColonneIdentifiants_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColonne"


    // $ANTLR start "entryRuleColonne_Impl"
    // InternalSchemaTable.g:283:1: entryRuleColonne_Impl returns [EObject current=null] : iv_ruleColonne_Impl= ruleColonne_Impl EOF ;
    public final EObject entryRuleColonne_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColonne_Impl = null;


        try {
            // InternalSchemaTable.g:283:53: (iv_ruleColonne_Impl= ruleColonne_Impl EOF )
            // InternalSchemaTable.g:284:2: iv_ruleColonne_Impl= ruleColonne_Impl EOF
            {
             newCompositeNode(grammarAccess.getColonne_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColonne_Impl=ruleColonne_Impl();

            state._fsp--;

             current =iv_ruleColonne_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColonne_Impl"


    // $ANTLR start "ruleColonne_Impl"
    // InternalSchemaTable.g:290:1: ruleColonne_Impl returns [EObject current=null] : (otherlv_0= 'c' ( (lv_nom_1_0= ruleEString ) ) ) ;
    public final EObject ruleColonne_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_nom_1_0 = null;



        	enterRule();

        try {
            // InternalSchemaTable.g:296:2: ( (otherlv_0= 'c' ( (lv_nom_1_0= ruleEString ) ) ) )
            // InternalSchemaTable.g:297:2: (otherlv_0= 'c' ( (lv_nom_1_0= ruleEString ) ) )
            {
            // InternalSchemaTable.g:297:2: (otherlv_0= 'c' ( (lv_nom_1_0= ruleEString ) ) )
            // InternalSchemaTable.g:298:3: otherlv_0= 'c' ( (lv_nom_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getColonne_ImplAccess().getCKeyword_0());
            		
            // InternalSchemaTable.g:302:3: ( (lv_nom_1_0= ruleEString ) )
            // InternalSchemaTable.g:303:4: (lv_nom_1_0= ruleEString )
            {
            // InternalSchemaTable.g:303:4: (lv_nom_1_0= ruleEString )
            // InternalSchemaTable.g:304:5: lv_nom_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColonne_ImplAccess().getNomEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_nom_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColonne_ImplRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"xtext.SchemaTable.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColonne_Impl"


    // $ANTLR start "entryRuleEString"
    // InternalSchemaTable.g:325:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSchemaTable.g:325:47: (iv_ruleEString= ruleEString EOF )
            // InternalSchemaTable.g:326:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSchemaTable.g:332:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSchemaTable.g:338:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSchemaTable.g:339:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSchemaTable.g:339:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSchemaTable.g:340:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSchemaTable.g:348:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAlgorithme"
    // InternalSchemaTable.g:359:1: entryRuleAlgorithme returns [EObject current=null] : iv_ruleAlgorithme= ruleAlgorithme EOF ;
    public final EObject entryRuleAlgorithme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithme = null;


        try {
            // InternalSchemaTable.g:359:51: (iv_ruleAlgorithme= ruleAlgorithme EOF )
            // InternalSchemaTable.g:360:2: iv_ruleAlgorithme= ruleAlgorithme EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithme=ruleAlgorithme();

            state._fsp--;

             current =iv_ruleAlgorithme; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlgorithme"


    // $ANTLR start "ruleAlgorithme"
    // InternalSchemaTable.g:366:1: ruleAlgorithme returns [EObject current=null] : (otherlv_0= 'Algorithme' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ressource' ( (lv_ressource_4_0= ruleEString ) ) (otherlv_5= 'documentation' ( (lv_documentation_6_0= ruleEString ) ) )? (otherlv_7= 'langage' ( (lv_langage_8_0= ruleLangage ) ) )? (otherlv_9= 'entree' otherlv_10= '{' ( (lv_entree_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_entree_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= 'sortie' ( (lv_sortie_16_0= ruleEString ) ) otherlv_17= '}' ) ;
    public final EObject ruleAlgorithme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_nom_1_0 = null;

        AntlrDatatypeRuleToken lv_ressource_4_0 = null;

        AntlrDatatypeRuleToken lv_documentation_6_0 = null;

        Enumerator lv_langage_8_0 = null;

        AntlrDatatypeRuleToken lv_entree_11_0 = null;

        AntlrDatatypeRuleToken lv_entree_13_0 = null;

        AntlrDatatypeRuleToken lv_sortie_16_0 = null;



        	enterRule();

        try {
            // InternalSchemaTable.g:372:2: ( (otherlv_0= 'Algorithme' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ressource' ( (lv_ressource_4_0= ruleEString ) ) (otherlv_5= 'documentation' ( (lv_documentation_6_0= ruleEString ) ) )? (otherlv_7= 'langage' ( (lv_langage_8_0= ruleLangage ) ) )? (otherlv_9= 'entree' otherlv_10= '{' ( (lv_entree_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_entree_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= 'sortie' ( (lv_sortie_16_0= ruleEString ) ) otherlv_17= '}' ) )
            // InternalSchemaTable.g:373:2: (otherlv_0= 'Algorithme' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ressource' ( (lv_ressource_4_0= ruleEString ) ) (otherlv_5= 'documentation' ( (lv_documentation_6_0= ruleEString ) ) )? (otherlv_7= 'langage' ( (lv_langage_8_0= ruleLangage ) ) )? (otherlv_9= 'entree' otherlv_10= '{' ( (lv_entree_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_entree_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= 'sortie' ( (lv_sortie_16_0= ruleEString ) ) otherlv_17= '}' )
            {
            // InternalSchemaTable.g:373:2: (otherlv_0= 'Algorithme' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ressource' ( (lv_ressource_4_0= ruleEString ) ) (otherlv_5= 'documentation' ( (lv_documentation_6_0= ruleEString ) ) )? (otherlv_7= 'langage' ( (lv_langage_8_0= ruleLangage ) ) )? (otherlv_9= 'entree' otherlv_10= '{' ( (lv_entree_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_entree_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= 'sortie' ( (lv_sortie_16_0= ruleEString ) ) otherlv_17= '}' )
            // InternalSchemaTable.g:374:3: otherlv_0= 'Algorithme' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ressource' ( (lv_ressource_4_0= ruleEString ) ) (otherlv_5= 'documentation' ( (lv_documentation_6_0= ruleEString ) ) )? (otherlv_7= 'langage' ( (lv_langage_8_0= ruleLangage ) ) )? (otherlv_9= 'entree' otherlv_10= '{' ( (lv_entree_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_entree_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= 'sortie' ( (lv_sortie_16_0= ruleEString ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgorithmeAccess().getAlgorithmeKeyword_0());
            		
            // InternalSchemaTable.g:378:3: ( (lv_nom_1_0= ruleEString ) )
            // InternalSchemaTable.g:379:4: (lv_nom_1_0= ruleEString )
            {
            // InternalSchemaTable.g:379:4: (lv_nom_1_0= ruleEString )
            // InternalSchemaTable.g:380:5: lv_nom_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAlgorithmeAccess().getNomEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_nom_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgorithmeRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"xtext.SchemaTable.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAlgorithmeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAlgorithmeAccess().getRessourceKeyword_3());
            		
            // InternalSchemaTable.g:405:3: ( (lv_ressource_4_0= ruleEString ) )
            // InternalSchemaTable.g:406:4: (lv_ressource_4_0= ruleEString )
            {
            // InternalSchemaTable.g:406:4: (lv_ressource_4_0= ruleEString )
            // InternalSchemaTable.g:407:5: lv_ressource_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAlgorithmeAccess().getRessourceEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_ressource_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgorithmeRule());
            					}
            					set(
            						current,
            						"ressource",
            						lv_ressource_4_0,
            						"xtext.SchemaTable.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSchemaTable.g:424:3: (otherlv_5= 'documentation' ( (lv_documentation_6_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSchemaTable.g:425:4: otherlv_5= 'documentation' ( (lv_documentation_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getAlgorithmeAccess().getDocumentationKeyword_5_0());
                    			
                    // InternalSchemaTable.g:429:4: ( (lv_documentation_6_0= ruleEString ) )
                    // InternalSchemaTable.g:430:5: (lv_documentation_6_0= ruleEString )
                    {
                    // InternalSchemaTable.g:430:5: (lv_documentation_6_0= ruleEString )
                    // InternalSchemaTable.g:431:6: lv_documentation_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAlgorithmeAccess().getDocumentationEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_documentation_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlgorithmeRule());
                    						}
                    						set(
                    							current,
                    							"documentation",
                    							lv_documentation_6_0,
                    							"xtext.SchemaTable.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSchemaTable.g:449:3: (otherlv_7= 'langage' ( (lv_langage_8_0= ruleLangage ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSchemaTable.g:450:4: otherlv_7= 'langage' ( (lv_langage_8_0= ruleLangage ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getAlgorithmeAccess().getLangageKeyword_6_0());
                    			
                    // InternalSchemaTable.g:454:4: ( (lv_langage_8_0= ruleLangage ) )
                    // InternalSchemaTable.g:455:5: (lv_langage_8_0= ruleLangage )
                    {
                    // InternalSchemaTable.g:455:5: (lv_langage_8_0= ruleLangage )
                    // InternalSchemaTable.g:456:6: lv_langage_8_0= ruleLangage
                    {

                    						newCompositeNode(grammarAccess.getAlgorithmeAccess().getLangageLangageEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_langage_8_0=ruleLangage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlgorithmeRule());
                    						}
                    						set(
                    							current,
                    							"langage",
                    							lv_langage_8_0,
                    							"xtext.SchemaTable.Langage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSchemaTable.g:474:3: (otherlv_9= 'entree' otherlv_10= '{' ( (lv_entree_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_entree_13_0= ruleEString ) ) )* otherlv_14= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSchemaTable.g:475:4: otherlv_9= 'entree' otherlv_10= '{' ( (lv_entree_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_entree_13_0= ruleEString ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getAlgorithmeAccess().getEntreeKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getAlgorithmeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalSchemaTable.g:483:4: ( (lv_entree_11_0= ruleEString ) )
                    // InternalSchemaTable.g:484:5: (lv_entree_11_0= ruleEString )
                    {
                    // InternalSchemaTable.g:484:5: (lv_entree_11_0= ruleEString )
                    // InternalSchemaTable.g:485:6: lv_entree_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAlgorithmeAccess().getEntreeEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_entree_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlgorithmeRule());
                    						}
                    						add(
                    							current,
                    							"entree",
                    							lv_entree_11_0,
                    							"xtext.SchemaTable.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSchemaTable.g:502:4: (otherlv_12= ',' ( (lv_entree_13_0= ruleEString ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSchemaTable.g:503:5: otherlv_12= ',' ( (lv_entree_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getAlgorithmeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSchemaTable.g:507:5: ( (lv_entree_13_0= ruleEString ) )
                    	    // InternalSchemaTable.g:508:6: (lv_entree_13_0= ruleEString )
                    	    {
                    	    // InternalSchemaTable.g:508:6: (lv_entree_13_0= ruleEString )
                    	    // InternalSchemaTable.g:509:7: lv_entree_13_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlgorithmeAccess().getEntreeEStringParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_entree_13_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlgorithmeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entree",
                    	    								lv_entree_13_0,
                    	    								"xtext.SchemaTable.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getAlgorithmeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getAlgorithmeAccess().getSortieKeyword_8());
            		
            // InternalSchemaTable.g:536:3: ( (lv_sortie_16_0= ruleEString ) )
            // InternalSchemaTable.g:537:4: (lv_sortie_16_0= ruleEString )
            {
            // InternalSchemaTable.g:537:4: (lv_sortie_16_0= ruleEString )
            // InternalSchemaTable.g:538:5: lv_sortie_16_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAlgorithmeAccess().getSortieEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_sortie_16_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgorithmeRule());
            					}
            					set(
            						current,
            						"sortie",
            						lv_sortie_16_0,
            						"xtext.SchemaTable.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getAlgorithmeAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlgorithme"


    // $ANTLR start "entryRuleColonneDerivee"
    // InternalSchemaTable.g:563:1: entryRuleColonneDerivee returns [EObject current=null] : iv_ruleColonneDerivee= ruleColonneDerivee EOF ;
    public final EObject entryRuleColonneDerivee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColonneDerivee = null;


        try {
            // InternalSchemaTable.g:563:55: (iv_ruleColonneDerivee= ruleColonneDerivee EOF )
            // InternalSchemaTable.g:564:2: iv_ruleColonneDerivee= ruleColonneDerivee EOF
            {
             newCompositeNode(grammarAccess.getColonneDeriveeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColonneDerivee=ruleColonneDerivee();

            state._fsp--;

             current =iv_ruleColonneDerivee; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColonneDerivee"


    // $ANTLR start "ruleColonneDerivee"
    // InternalSchemaTable.g:570:1: ruleColonneDerivee returns [EObject current=null] : (otherlv_0= 'c_deriv' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= 'algo' ( (lv_algorithme_3_0= ruleAlgorithme ) ) ) ;
    public final EObject ruleColonneDerivee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_nom_1_0 = null;

        EObject lv_algorithme_3_0 = null;



        	enterRule();

        try {
            // InternalSchemaTable.g:576:2: ( (otherlv_0= 'c_deriv' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= 'algo' ( (lv_algorithme_3_0= ruleAlgorithme ) ) ) )
            // InternalSchemaTable.g:577:2: (otherlv_0= 'c_deriv' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= 'algo' ( (lv_algorithme_3_0= ruleAlgorithme ) ) )
            {
            // InternalSchemaTable.g:577:2: (otherlv_0= 'c_deriv' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= 'algo' ( (lv_algorithme_3_0= ruleAlgorithme ) ) )
            // InternalSchemaTable.g:578:3: otherlv_0= 'c_deriv' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= 'algo' ( (lv_algorithme_3_0= ruleAlgorithme ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getColonneDeriveeAccess().getC_derivKeyword_0());
            		
            // InternalSchemaTable.g:582:3: ( (lv_nom_1_0= ruleEString ) )
            // InternalSchemaTable.g:583:4: (lv_nom_1_0= ruleEString )
            {
            // InternalSchemaTable.g:583:4: (lv_nom_1_0= ruleEString )
            // InternalSchemaTable.g:584:5: lv_nom_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColonneDeriveeAccess().getNomEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_nom_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColonneDeriveeRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"xtext.SchemaTable.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getColonneDeriveeAccess().getAlgoKeyword_2());
            		
            // InternalSchemaTable.g:605:3: ( (lv_algorithme_3_0= ruleAlgorithme ) )
            // InternalSchemaTable.g:606:4: (lv_algorithme_3_0= ruleAlgorithme )
            {
            // InternalSchemaTable.g:606:4: (lv_algorithme_3_0= ruleAlgorithme )
            // InternalSchemaTable.g:607:5: lv_algorithme_3_0= ruleAlgorithme
            {

            					newCompositeNode(grammarAccess.getColonneDeriveeAccess().getAlgorithmeAlgorithmeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_algorithme_3_0=ruleAlgorithme();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColonneDeriveeRule());
            					}
            					set(
            						current,
            						"algorithme",
            						lv_algorithme_3_0,
            						"xtext.SchemaTable.Algorithme");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColonneDerivee"


    // $ANTLR start "entryRuleColonneEtrangere"
    // InternalSchemaTable.g:628:1: entryRuleColonneEtrangere returns [EObject current=null] : iv_ruleColonneEtrangere= ruleColonneEtrangere EOF ;
    public final EObject entryRuleColonneEtrangere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColonneEtrangere = null;


        try {
            // InternalSchemaTable.g:628:57: (iv_ruleColonneEtrangere= ruleColonneEtrangere EOF )
            // InternalSchemaTable.g:629:2: iv_ruleColonneEtrangere= ruleColonneEtrangere EOF
            {
             newCompositeNode(grammarAccess.getColonneEtrangereRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColonneEtrangere=ruleColonneEtrangere();

            state._fsp--;

             current =iv_ruleColonneEtrangere; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColonneEtrangere"


    // $ANTLR start "ruleColonneEtrangere"
    // InternalSchemaTable.g:635:1: ruleColonneEtrangere returns [EObject current=null] : (otherlv_0= 'c_etr' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= 'id' ( (lv_idColonneTableEtrangere_3_0= ruleEString ) ) otherlv_4= 'from' ( ( ruleEString ) ) ) ;
    public final EObject ruleColonneEtrangere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nom_1_0 = null;

        AntlrDatatypeRuleToken lv_idColonneTableEtrangere_3_0 = null;



        	enterRule();

        try {
            // InternalSchemaTable.g:641:2: ( (otherlv_0= 'c_etr' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= 'id' ( (lv_idColonneTableEtrangere_3_0= ruleEString ) ) otherlv_4= 'from' ( ( ruleEString ) ) ) )
            // InternalSchemaTable.g:642:2: (otherlv_0= 'c_etr' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= 'id' ( (lv_idColonneTableEtrangere_3_0= ruleEString ) ) otherlv_4= 'from' ( ( ruleEString ) ) )
            {
            // InternalSchemaTable.g:642:2: (otherlv_0= 'c_etr' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= 'id' ( (lv_idColonneTableEtrangere_3_0= ruleEString ) ) otherlv_4= 'from' ( ( ruleEString ) ) )
            // InternalSchemaTable.g:643:3: otherlv_0= 'c_etr' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= 'id' ( (lv_idColonneTableEtrangere_3_0= ruleEString ) ) otherlv_4= 'from' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getColonneEtrangereAccess().getC_etrKeyword_0());
            		
            // InternalSchemaTable.g:647:3: ( (lv_nom_1_0= ruleEString ) )
            // InternalSchemaTable.g:648:4: (lv_nom_1_0= ruleEString )
            {
            // InternalSchemaTable.g:648:4: (lv_nom_1_0= ruleEString )
            // InternalSchemaTable.g:649:5: lv_nom_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColonneEtrangereAccess().getNomEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_nom_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColonneEtrangereRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"xtext.SchemaTable.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getColonneEtrangereAccess().getIdKeyword_2());
            		
            // InternalSchemaTable.g:670:3: ( (lv_idColonneTableEtrangere_3_0= ruleEString ) )
            // InternalSchemaTable.g:671:4: (lv_idColonneTableEtrangere_3_0= ruleEString )
            {
            // InternalSchemaTable.g:671:4: (lv_idColonneTableEtrangere_3_0= ruleEString )
            // InternalSchemaTable.g:672:5: lv_idColonneTableEtrangere_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColonneEtrangereAccess().getIdColonneTableEtrangereEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_idColonneTableEtrangere_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColonneEtrangereRule());
            					}
            					set(
            						current,
            						"idColonneTableEtrangere",
            						lv_idColonneTableEtrangere_3_0,
            						"xtext.SchemaTable.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getColonneEtrangereAccess().getFromKeyword_4());
            		
            // InternalSchemaTable.g:693:3: ( ( ruleEString ) )
            // InternalSchemaTable.g:694:4: ( ruleEString )
            {
            // InternalSchemaTable.g:694:4: ( ruleEString )
            // InternalSchemaTable.g:695:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColonneEtrangereRule());
            					}
            				

            					newCompositeNode(grammarAccess.getColonneEtrangereAccess().getTableEtrangereTableCrossReference_5_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColonneEtrangere"


    // $ANTLR start "entryRuleColonneIdentifiants"
    // InternalSchemaTable.g:713:1: entryRuleColonneIdentifiants returns [EObject current=null] : iv_ruleColonneIdentifiants= ruleColonneIdentifiants EOF ;
    public final EObject entryRuleColonneIdentifiants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColonneIdentifiants = null;


        try {
            // InternalSchemaTable.g:713:60: (iv_ruleColonneIdentifiants= ruleColonneIdentifiants EOF )
            // InternalSchemaTable.g:714:2: iv_ruleColonneIdentifiants= ruleColonneIdentifiants EOF
            {
             newCompositeNode(grammarAccess.getColonneIdentifiantsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColonneIdentifiants=ruleColonneIdentifiants();

            state._fsp--;

             current =iv_ruleColonneIdentifiants; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColonneIdentifiants"


    // $ANTLR start "ruleColonneIdentifiants"
    // InternalSchemaTable.g:720:1: ruleColonneIdentifiants returns [EObject current=null] : (otherlv_0= 'c_id' ( (lv_nom_1_0= ruleEString ) ) ) ;
    public final EObject ruleColonneIdentifiants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_nom_1_0 = null;



        	enterRule();

        try {
            // InternalSchemaTable.g:726:2: ( (otherlv_0= 'c_id' ( (lv_nom_1_0= ruleEString ) ) ) )
            // InternalSchemaTable.g:727:2: (otherlv_0= 'c_id' ( (lv_nom_1_0= ruleEString ) ) )
            {
            // InternalSchemaTable.g:727:2: (otherlv_0= 'c_id' ( (lv_nom_1_0= ruleEString ) ) )
            // InternalSchemaTable.g:728:3: otherlv_0= 'c_id' ( (lv_nom_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getColonneIdentifiantsAccess().getC_idKeyword_0());
            		
            // InternalSchemaTable.g:732:3: ( (lv_nom_1_0= ruleEString ) )
            // InternalSchemaTable.g:733:4: (lv_nom_1_0= ruleEString )
            {
            // InternalSchemaTable.g:733:4: (lv_nom_1_0= ruleEString )
            // InternalSchemaTable.g:734:5: lv_nom_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColonneIdentifiantsAccess().getNomEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_nom_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColonneIdentifiantsRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"xtext.SchemaTable.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColonneIdentifiants"


    // $ANTLR start "ruleLangage"
    // InternalSchemaTable.g:755:1: ruleLangage returns [Enumerator current=null] : ( (enumLiteral_0= 'PYTHON' ) | (enumLiteral_1= 'INTERNE' ) ) ;
    public final Enumerator ruleLangage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSchemaTable.g:761:2: ( ( (enumLiteral_0= 'PYTHON' ) | (enumLiteral_1= 'INTERNE' ) ) )
            // InternalSchemaTable.g:762:2: ( (enumLiteral_0= 'PYTHON' ) | (enumLiteral_1= 'INTERNE' ) )
            {
            // InternalSchemaTable.g:762:2: ( (enumLiteral_0= 'PYTHON' ) | (enumLiteral_1= 'INTERNE' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            else if ( (LA10_0==31) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSchemaTable.g:763:3: (enumLiteral_0= 'PYTHON' )
                    {
                    // InternalSchemaTable.g:763:3: (enumLiteral_0= 'PYTHON' )
                    // InternalSchemaTable.g:764:4: enumLiteral_0= 'PYTHON'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getLangageAccess().getPYTHONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLangageAccess().getPYTHONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSchemaTable.g:771:3: (enumLiteral_1= 'INTERNE' )
                    {
                    // InternalSchemaTable.g:771:3: (enumLiteral_1= 'INTERNE' )
                    // InternalSchemaTable.g:772:4: enumLiteral_1= 'INTERNE'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getLangageAccess().getINTERNEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLangageAccess().getINTERNEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLangage"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000025020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});

}