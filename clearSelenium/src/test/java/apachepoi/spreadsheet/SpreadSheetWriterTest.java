package apachepoi.spreadsheet;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;

import brokerDealer.util.FilesFoldersUtil;

public class SpreadSheetWriterTest {
	
	@Test
	public void testWriteIntoSpreadSheet() throws FileNotFoundException, IOException {
		// Arrange 
		Map<String, BigDecimal> mapTickerDividend = 
			new HashMap<String, BigDecimal>();
		mapTickerDividend.put("GSHP3",		new BigDecimal(348.8));
		mapTickerDividend.put("TRPN3 ",		new BigDecimal(267.9));
		mapTickerDividend.put("MMAQ4 ",		new BigDecimal(45.2));
		mapTickerDividend.put("BPAT33 ",	new BigDecimal(35.7));
		mapTickerDividend.put("BPAR3 ",		new BigDecimal(28.0));
		
		SpreadSheetWriter.writeIntoSpreadSheet(mapTickerDividend);
	}
	
	
	@Test
	public void testFillSpreadsheet() throws FileNotFoundException, IOException {
		// Arrange 
		HashMap<String, BigDecimal> originalMapTickerDividend = 
			new HashMap<String, BigDecimal>();
		originalMapTickerDividend.put("GSHP3",		new BigDecimal(348.8));
		originalMapTickerDividend.put("TRPN3 ",		new BigDecimal(267.9));
		originalMapTickerDividend.put("MMAQ4 ",		new BigDecimal(45.2));
		originalMapTickerDividend.put("BPAT33 ",	new BigDecimal(35.7));
		originalMapTickerDividend.put("BPAR3 ",		new BigDecimal(28.0));
		
		//assertEquals(originalMapTickerDividend, clonedMapTickerDividend);
		
		SpreadSheetWriter.fillSpreadsheet(
			SpreadSheetWriter.createXlsxSpreadSheet(Optional.of(FilesFoldersUtil.TEST_XLSX_FILENAME)),
			originalMapTickerDividend
		);
	}
	
	@Test
	public void testCreateWorkbookSpreadSheet() throws IOException {
		Workbook workbookSpreadsheet = 
			SpreadSheetWriter.createWorkbookSpreadSheet(Optional.of(FilesFoldersUtil.TEST_XLSX_FILENAME));
		
		assertNotNull(workbookSpreadsheet);
	}
	
	@Test
	public void testCreateXlsxFileInputStream() throws FileNotFoundException, IOException {
		Workbook workbookSpreadsheet =
			SpreadSheetWriter.createXlsxSpreadSheet(Optional.of(FilesFoldersUtil.TEST_XLSX_FILENAME));
		
		assertNotNull(workbookSpreadsheet);
	}
	
	@Test
	public void testGetTickerValuePairs() {
		// Arrange
		String fullData = "Final Hashmap: 875 {GSHP3=348.8, TRPN3=267.9, MMAQ4=45.2, BPAT33=35.7, BPAR3=28.0, SOND5=18.5, SOND6=17.9, SOND3=15.1, QUAL3=15.1, ENAT3=14.8, WHRL4=12.1, WHRL3=11.7, SEER3=10.8, CEEB3=10.6, CPLE5=10.5, TRPL4=10.5, CIEL3=10.3, WIZS3=10.1, BRSR5=9.7, SMLS3=9.6, BRSR6=9.5, TRPL3=9.3, BRDT3=9.1, BSLI3=9.0, BRSR3=8.8, LEVE3=8.8, ITUB3=8.7, MEAL3=8.6, BSLI4=8.6, PEAB4=8.6, ITSA3=8.6, ITSA4=8.6, BBSE3=8.4, PEAB3=8.4, MTIG3=8.4, BMIN4=8.1, TAEE11=8.1, GEPA3=8.1, CEBR5=7.9, CSNA3=7.8, TUPY3=7.8, VIVT3=7.6, FIBR3=7.6, CSRN6=7.5, MOAR3=7.5, FESA4=7.4, GEPA4=7.4, FRAS3=7.4, ITUB4=7.4, DIRR3=7.3, BRGE7=7.2, CEPE6=7.1, CSRN5=7.1, BRML3=7.0, CTSA3=7.0, VIVT4=6.9, CTSA4=6.7, CSRN3=6.5, KLBN4=6.4, CARD3=6.4, ROMI3=6.4, CESP5=6.3, KLBN11=6.1, BRGE6=6.1, DTEX3=6.0, BMEB4=5.9, ABCB4=5.8, PATI4=5.8, EKTR4=5.7, PTNT4=5.7, TIET11=5.7, TIET4=5.7, CEPE5=5.6, CALI4=5.6, PSSA3=5.6, AGRO3=5.5, CRPG6=5.5, CRPG5=5.5, BBDC4=5.5, MTSA4=5.5, BRIV4=5.4, BRGE11=5.4, BBDC3=5.4, BEES3=5.3, CYRE3=5.3, EEEL4=5.3, KLBN3=5.3, TIET3=5.3, REDE3=5.2, EKTR3=5.2, SLCE3=5.2, BBAS3=5.2, ENMT4=5.2, BEES4=5.1, SANB4=5.1, EEEL3=5.1, RPAD5=5.1, CGAS3=5.0, SAPR11=5.0, SAPR4=5.0, CGAS5=4.9, BNBR3=4.9, CRIV4=4.7, CGRA4=4.7, BRGE8=4.7, SAPR3=4.6, CSAB4=4.6, CMIG4=4.5, CGRA3=4.5, CCRO3=4.5, POMO3=4.4, FESA3=4.4, VLID3=4.3, TAEE3=4.2, TAEE4=4.2, CSAB3=4.2, ENBR3=4.2, SANB11=4.2, POMO4=4.1, CMIG3=4.1, BGIP4=4.1, FLRY3=4.0, TIMP3=4.0, CAML3=4.0, MRVE3=4.0, PTBL3=3.9, BRAP3=3.8, BRAP4=3.8, PATI3=3.8, HGTX3=3.8, BAZA3=3.8, MERC4=3.8, PETR4=3.8, COCE3=3.8, SANB3=3.6, ELET6=3.5, TGMA3=3.4, GOAU3=3.3, GGBR3=3.3, EMAE4=3.3, HYPE3=3.3, CESP3=3.3, GOAU4=3.2, PTNT3=3.2, EGIE3=3.1, COCE5=3.1, BMKS3=3.0, BRKM5=3.0, NEOE3=3.0, DOHL4=3.0, CESP6=3.0, SHUL4=3.0, ECPR3=2.9, BRKM3=2.9, LIPR3=2.9, JOPA4=2.9, ENMT3=2.9, TEND3=2.9, GGBR4=2.8, EALT4=2.8, UGPA3=2.8, ODPV3=2.8, ARZZ3=2.7, CSMG3=2.7, CLSC4=2.7, CPLE6=2.7, JHSF3=2.7, GRND3=2.7, JOPA3=2.7, ALUP4=2.7, CPLE3=2.6, BGIP3=2.6, ECPR4=2.6, WLMM4=2.6, IRBR3=2.5, ALUP11=2.5, ENGI4=2.5, ECOR3=2.5, MYPK3=2.4, BRKM6=2.4, DOHL3=2.4, LUXM4=2.4, WLMM3=2.4, CRFB3=2.4, ENGI11=2.3, BPAC5=2.3, LLIS3=2.3, USIM5=2.2, BPAC11=2.2, GUAR3=2.2, SBSP3=2.2, RAPT3=2.2, ALUP3=2.2, CLSC3=2.1, MOVI3=2.1, ELET3=2.1, B3SA3=2.1, USIM6=2.0, SULA4=2.0, PARD3=2.0, ELEK4=2.0, COGN3=2.0, PNVL4=1.9, ENGI3=1.9, SMTO3=1.8, LCAM3=1.8, IGTA3=1.8, BPAC3=1.8, CSAN3=1.8, ABEV3=1.8, RAPT4=1.8, DASA3=1.7, ELEK3=1.7, USIM3=1.6, SULA11=1.6, MULT3=1.5, NAFG3=1.4, SUZB3=1.4, NAFG4=1.4, WEGE3=1.4, MPLU3=1.4, PCAR4=1.4, PETR3=1.4, CPFE3=1.3, JPSA3=1.3, PCAR3=1.3, BALM3=1.2, PNVL3=1.2, LREN3=1.1, MDIA3=1.1, SULA3=1.1, SHOW3=1.0, ALSC3=1.0, BALM4=1.0, TRIS3=1.0, EUCA4=1.0, EQTL3=1.0, RENT3=0.9, UNIP6=0.9, UNIP5=0.9, BKBR3=0.9, MSPA3=0.9, MSPA4=0.9, JSLG3=0.8, BAUH4=0.8, BPAN4=0.8, CVCB3=0.8, UNIP3=0.8, OFSA3=0.8, HBTS5=0.8, CELP5=0.7, LIGT3=0.7, EALT3=0.7, HAPV3=0.7, GPCP3=0.7, RANI3=0.7, CELP7=0.6, RADL3=0.6, RANI4=0.6, EUCA3=0.6, NATU3=0.6, MTIG4=0.6, BMEB3=0.5, AALR3=0.5, KEPL3=0.5, MGLU3=0.5, LAME3=0.5, LINX3=0.5, TOTS3=0.4, LOGG3=0.4, LAME4=0.4, BIDI4=0.4, BMIN3=0.3, EZTC3=0.3, CRIV3=0.3, ALSO3=0.3, GUAR4=0.2, SCAR3=0.2, GNDI3=0.2, BIDI11=0.1, STBP3=0.1, EMBR3=0.1, FIGE3=0.1, FIGE4=0.1, BIDI3=0.1, CEBR3=0.1, CEBR6=0.1, SQIA3=0.1, FFTL3=0.0, RPSA4=0.0, FFTL4=0.0, DTCY3=0.0, ESTC11=0.0, OMGE3=0.0, MYPK4=0.0, DJON4=0.0, TBLE5=0.0, TBLE6=0.0, ASSM4=0.0, IDNT3=0.0, ASSM3=0.0, ARTR3=0.0, IGBR3=0.0, IGBR5=0.0, RDCD3=0.0, LATM11=0.0, IGBR6=0.0, ARLA4=0.0, MILK33=0.0, ARLA3=0.0, RSID3=0.0, ABCB3=0.0, BMEF3=0.0, FGUI4=0.0, FGUI3=0.0, RLOG3=0.0, PINE3=0.0, PINE4=0.0, LIXC3=0.0, LIXC4=0.0, EBCO4=0.0, PRTX3=0.0, EBCO3=0.0, REDE4=0.0, KROT4=0.0, AMIL3=0.0, ALBA3=0.0, TKNO4=0.0, BPNM3=0.0, GAZO4=0.0, GAZO3=0.0, LIGH3=0.0, BPHA3=0.0, TMCP4=0.0, TMCP3=0.0, EBTP4=0.0, EBTP3=0.0, TCSL4=0.0, AVIL3=0.0, TCOC4=0.0, TCOC3=0.0, LETO3=0.0, MAPT3=0.0, GOLL4=0.0, MAPT4=0.0, DOCA4=0.0, DOCA3=0.0, MGEL3=0.0, MGEL4=0.0, SEBB3=0.0, SUZB5=0.0, SEBB4=0.0, SUZB6=0.0, RCTB41=0.0, RCTB42=0.0, BTTL3=0.0, CELM3=0.0, BTTL4=0.0, DXTG4=0.0, SUZA4=0.0, MEND6=0.0, DFVA4=0.0, DFVA3=0.0, MEND5=0.0, VVAX4=0.0, VVAX3=0.0, IMBI3=0.0, IMBI4=0.0, AMBV4=0.0, AMBV3=0.0, EBEN4=0.0, GPIV33=0.0, UOLL4=0.0, CLSC6=0.0, CLSC5=0.0, CBEE3=0.0, ALLL4=0.0, ALLL3=0.0, BRTP4=0.0, TOYB3=0.0, APER3=0.0, RAIA3=0.0, BRTP3=0.0, LREN4=0.0, BELG4=0.0, TOYB4=0.0, BELG3=0.0, RCTB31=0.0, RCTB33=0.0, CCHI4=0.0, CCHI3=0.0, CTPC4=0.0, TEKA3=0.0, TEKA4=0.0, LETO5=0.0, MNPR4=0.0, MNPR3=0.0, CTPC3=0.0, HETA4=0.0, HETA3=0.0, LECO4=0.0, LECO3=0.0, TXRX3=0.0, TXRX4=0.0, WEGE4=0.0, ELUM3=0.0, ELUM4=0.0, BAHI3=0.0, BAHI4=0.0, BAHI5=0.0, ALLL11=0.0, CNFB4=0.0, KSSA3=0.0, DUQE3=0.0, DUQE4=0.0, RCSL4=0.0, INEP3=0.0, TRFO3=0.0, TRFO4=0.0, INEP4=0.0, CRPG3=0.0, AGEI3=0.0, BRIV3=0.0, ARTE4=0.0, JBSS3=0.0, ARTE3=0.0, SJOS3=0.0, EVEN3=0.0, SJOS4=0.0, BOBR3=0.0, BOBR4=0.0, TAMM3=0.0, TAMM4=0.0, JBDU4=0.0, JBDU3=0.0, CRTP5=0.0, CRTP3=0.0, DAGB33=0.0, TMAR5=0.0, BICB3=0.0, BICB4=0.0, TMAR3=0.0, TMAR6=0.0, CCPR3=0.0, ETER3=0.0, PLDN4=0.0, UCOP4=0.0, ETER4=0.0, SMLE3=0.0, CAFE3=0.0, CAFE4=0.0, ARCE3=0.0, MNSA4=0.0, MNSA3=0.0, CTIP3=0.0, DHBI4=0.0, DHBI3=0.0, AZUL4=0.0, TEMP3=0.0, ICPI3=0.0, AFLU3=0.0, AFLU5=0.0, SZPQ4=0.0, VAGV4=0.0, RAIL3=0.0, VAGV3=0.0, DMMO3=0.0, BCAL6=0.0, VCPA4=0.0, ACES3=0.0, FBRA4=0.0, ACES4=0.0, PRBC4=0.0, PRBC3=0.0, MMXM3=0.0, ITEC3=0.0, DSUL3=0.0, APTI4=0.0, CREM3=0.0, CREM4=0.0, GFSA3=0.0, BTOW3=0.0, RPMG3=0.0, RPMG4=0.0, AGIN3=0.0, LCSA3=0.0, LCSA4=0.0, SEDU3=0.0, VGOR3=0.0, BRGE12=0.0, VPTA4=0.0, VPTA3=0.0, NORD3=0.0, VULC4=0.0, VULC3=0.0, RDTR3=0.0, RSIP3=0.0, OSXB3=0.0, RSIP4=0.0, DPPI4=0.0, DPPI3=0.0, UBBR11=0.0, PDGR3=0.0, ATOM3=0.0, BERG3=0.0, CCTU4=0.0, VGOR4=0.0, PMET6=0.0, PMET5=0.0, RDNI3=0.0, GETI4=0.0, GETI3=0.0, SLED4=0.0, PMET3=0.0, TSEP4=0.0, SLED3=0.0, TSEP3=0.0, AFLT3=0.0, CEGR3=0.0, IENG3=0.0, PMAM4=0.0, PMAM3=0.0, SNSY5=0.0, CEPE3=0.0, CALI3=0.0, CPRE3=0.0, PEFX5=0.0, MNDL4=0.0, MNDL3=0.0, PEFX3=0.0, BRGE3=0.0, BRGE5=0.0, DAYC4=0.0, DAYC3=0.0, CNTO3=0.0, FRTA3=0.0, IENG5=0.0, PFRM3=0.0, BECE3=0.0, TANC4=0.0, TLCP4=0.0, BECE4=0.0, TLCP3=0.0, INHA3=0.0, CEAB3=0.0, MLFT4=0.0, VNET3=0.0, BEEF3=0.0, CLAN4=0.0, CLAN3=0.0, CFLU4=0.0, HBOR3=0.0, ADHM3=0.0, PNOR6=0.0, PNOR5=0.0, FRIO3=0.0, VALE5=0.0, VIVA3=0.0, TSPP3=0.0, TSPP4=0.0, LPSB3=0.0, VALE3=0.0, LOGN3=0.0, AUTM3=0.0, CMMA4=0.0, ILLS4=0.0, ENEV3=0.0, BIOM3=0.0, BIOM4=0.0, CBMA4=0.0, MRFG3=0.0, CBMA3=0.0, TROR3=0.0, TROR4=0.0, CIQU4=0.0, CIQU3=0.0, PORP4=0.0, ALPA3=0.0, LGLO4=0.0, MEDI3=0.0, SEMP3=0.0, ALPA4=0.0, GALO4=0.0, FCAP4=0.0, GALO3=0.0, CYRE4=0.0, BMGB11=0.0, BUET3=0.0, ANIM3=0.0, BUET4=0.0, FCAP3=0.0, CEED3=0.0, MMAQ3=0.0, CEED4=0.0, KROT11=0.0, TERI3=0.0, BNCA3=0.0, ENER6=0.0, PTBL4=0.0, ENER3=0.0, ENER5=0.0, MILS3=0.0, BSCT3=0.0, CGOS3=0.0, BSCT5=0.0, BSCT6=0.0, CGOS4=0.0, UCAS3=0.0, ELPL3=0.0, ELPL4=0.0, ELPL5=0.0, ELPL6=0.0, CEEB5=0.0, CTKA4=0.0, CTKA3=0.0, UGPA4=0.0, TNCP3=0.0, TNCP4=0.0, ELEV3=0.0, BSEV3=0.0, BBTG11=0.0, BBTG13=0.0, BBTG12=0.0, TDBH4=0.0, TDBH3=0.0, RJCP3=0.0, TPIS3=0.0, CRUZ3=0.0, HOOT4=0.0, PLIM4=0.0, POPR4=0.0, AEDU3=0.0, BRSR4=0.0, ELET5=0.0, SFSA3=0.0, SFSA4=0.0, WMBY3=0.0, HGTX4=0.0, BPIA3=0.0, FBMC3=0.0, SLCP3=0.0, FBMC4=0.0, CCIM3=0.0, IMCH3=0.0, TPRC3=0.0, TNEP3=0.0, TNEP4=0.0, TPRC6=0.0, BDLL4=0.0, BDLL3=0.0, UBBR3=0.0, UBBR4=0.0, ECIS3=0.0, TMGC7=0.0, ECIS4=0.0, PLTO6=0.0, PLTO5=0.0, VINE5=0.0, VINE3=0.0, OSAO4=0.0, PTQS4=0.0, JFAB4=0.0, IVTT3=0.0, ILMD3=0.0, ILMD4=0.0, MRSL4=0.0, MRSL3=0.0, BHGR3=0.0, SCAR4=0.0, MAGG3=0.0, SGEN3=0.0, GRNL4=0.0, SGEN4=0.0, IDVL3=0.0, IDVL4=0.0, IGUA6=0.0, IGUA5=0.0, IGUA3=0.0, CTWR3=0.0, AZEV3=0.0, SALM3=0.0, SALM4=0.0, AZEV4=0.0, TCNO4=0.0, TCNO3=0.0, TMGC3=0.0, BRFS3=0.0, BSGR3=0.0, CCXC3=0.0, GAFP3=0.0, GBIO33=0.0, TENE5=0.0, TENE7=0.0, BESP3=0.0, BESP4=0.0, GAFP4=0.0, FLCL3=0.0, FLCL6=0.0, FLCL5=0.0, CRBM7=0.0, TELB3=0.0, TELB4=0.0, CRBM3=0.0, GLOB4=0.0, OIBR4=0.0, OIBR3=0.0, CZLT33=0.0, VIVR3=0.0, PRML3=0.0, AMAR3=0.0, VIGR3=0.0, CORR3=0.0, PRGA4=0.0, SPRI6=0.0, SPRI5=0.0, VIVO4=0.0, TECN3=0.0, RGEG3=0.0, ABYA3=0.0, VIVO3=0.0, REEM4=0.0, RPAD3=0.0, CORR4=0.0, JFEN3=0.0, RPAD6=0.0, BNBR4=0.0, CZRS3=0.0, AESL3=0.0, AESL4=0.0, LUXM3=0.0, CSPC4=0.0, CZRS4=0.0, CSPC3=0.0, SPRI3=0.0, REPA3=0.0, TUPY4=0.0, ESTR3=0.0, REPA4=0.0, FRAS4=0.0, ESTR4=0.0, MLPA3=0.0, AHEB5=0.0, MLPA4=0.0, CESP4=0.0, PRIO3=0.0, AHEB6=0.0, VPSC3=0.0, VPSC4=0.0, PRVI3=0.0, ROMI4=0.0, AMPI3=0.0, AHEB3=0.0, MSAN4=0.0, MSAN3=0.0, RSUL4=0.0, BISA3=0.0, NUTR3=0.0, BEMA3=0.0, SEBB11=0.0, TMGC11=0.0, AEDU11=0.0, TMGC13=0.0, TMGC12=0.0, MLPA12=0.0, CTSA8=0.0, ASTA4=0.0, PLAS3=0.0, DURA4=0.0, DURA3=0.0, RNPT3=0.0, RNPT4=0.0, ELCA4=0.0, ELCA3=0.0, TVIT3=0.0, BFIT3=0.0, BFIT4=0.0, TCSA3=0.0, LUPA3=0.0, SCLO4=0.0, SCLO3=0.0, GVTT3=0.0, IDVL11=0.0, SUBA3=0.0, MARI3=0.0, SDIA4=0.0, SDIA3=0.0, RNEW3=0.0, RNEW4=0.0, STBP11=0.0, PALF11=0.0, SULT3=0.0, TNLP3=0.0, POSI3=0.0, TNLP4=0.0, SULT4=0.0, CEDO3=0.0, CEDO4=0.0, CPSL3=0.0, MTBR3=0.0, MTBR4=0.0, CSTB4=0.0, CSTB3=0.0, CPFP4=0.0, TEFC11=0.0, CRDE3=0.0, RNEW11=0.0, FHER3=0.0, NETC4=0.0, NETC3=0.0, MAGS3=0.0, PALF5=0.0, PALF3=0.0, LEVE4=0.0, ARPS3=0.0, STRP4=0.0, SGPS3=0.0, HAGA4=0.0, HAGA3=0.0, OGXP3=0.0, AGEN33=0.0, BBRK3=0.0, FTRX3=0.0, MWET4=0.0, MWET3=0.0, FTRX4=0.0, BMTO4=0.0, RHDS4=0.0, BMTO3=0.0, RHDS3=0.0, DUFB11=0.0, AELP3=0.0, VVAR11=0.0, PITI4=0.0, ESCE3=0.0, PTPA3=0.0, PTPA4=0.0, TESA3=0.0, RIPI4=0.0, RIPI3=0.0, LIQO3=0.0, CMET4=0.0, ARCZ3=0.0, ARCZ6=0.0, WISA4=0.0, ARPS4=0.0, WISA3=0.0, VVAR4=0.0, VVAR3=0.0, BOVH3=0.0, CTNM4=0.0, CTNM3=0.0, PQUN3=0.0, PQUN4=0.0, LATS3=0.0, VTLM3=0.0, ESTC4=0.0, CPFG3=0.0, CPFG4=0.0, CASN3=0.0, LFFE4=0.0, LFFE3=0.0, MERC3=0.0, PCAR5=0.0, TARP11=0.0, FJTA4=0.0, FJTA3=0.0, SASG3=0.0, PTIP3=0.0, PTIP4=0.0, BRPR3=0.0, CAMB3=0.0, CPNY3=0.0, CAMB4=0.0, BAHI11=0.0, COCE6=0.0}";
		
		// Act
		String token = SpreadSheetWriter.getTickerValuePairs(fullData);
		
		// Assert
		assertNotNull(token);
		assertTrue(token.startsWith("GSHP"));
		assertTrue(token.endsWith("COCE6=0.0"));
	}
	
	@Test
	public void testSplitTickerValuePairs() {
		// Arrange
		String fullData = "Final Hashmap: 875 {GSHP3=348.8, TRPN3=267.9, MMAQ4=45.2, BPAT33=35.7, BPAR3=28.0, SOND5=18.5, SOND6=17.9, SOND3=15.1, QUAL3=15.1, ENAT3=14.8, WHRL4=12.1, WHRL3=11.7, SEER3=10.8, CEEB3=10.6, CPLE5=10.5, TRPL4=10.5, CIEL3=10.3, WIZS3=10.1, BRSR5=9.7, SMLS3=9.6, BRSR6=9.5, TRPL3=9.3, BRDT3=9.1, BSLI3=9.0, BRSR3=8.8, LEVE3=8.8, ITUB3=8.7, MEAL3=8.6, BSLI4=8.6, PEAB4=8.6, ITSA3=8.6, ITSA4=8.6, BBSE3=8.4, PEAB3=8.4, MTIG3=8.4, BMIN4=8.1, TAEE11=8.1, GEPA3=8.1, CEBR5=7.9, CSNA3=7.8, TUPY3=7.8, VIVT3=7.6, FIBR3=7.6, CSRN6=7.5, MOAR3=7.5, FESA4=7.4, GEPA4=7.4, FRAS3=7.4, ITUB4=7.4, DIRR3=7.3, BRGE7=7.2, CEPE6=7.1, CSRN5=7.1, BRML3=7.0, CTSA3=7.0, VIVT4=6.9, CTSA4=6.7, CSRN3=6.5, KLBN4=6.4, CARD3=6.4, ROMI3=6.4, CESP5=6.3, KLBN11=6.1, BRGE6=6.1, DTEX3=6.0, BMEB4=5.9, ABCB4=5.8, PATI4=5.8, EKTR4=5.7, PTNT4=5.7, TIET11=5.7, TIET4=5.7, CEPE5=5.6, CALI4=5.6, PSSA3=5.6, AGRO3=5.5, CRPG6=5.5, CRPG5=5.5, BBDC4=5.5, MTSA4=5.5, BRIV4=5.4, BRGE11=5.4, BBDC3=5.4, BEES3=5.3, CYRE3=5.3, EEEL4=5.3, KLBN3=5.3, TIET3=5.3, REDE3=5.2, EKTR3=5.2, SLCE3=5.2, BBAS3=5.2, ENMT4=5.2, BEES4=5.1, SANB4=5.1, EEEL3=5.1, RPAD5=5.1, CGAS3=5.0, SAPR11=5.0, SAPR4=5.0, CGAS5=4.9, BNBR3=4.9, CRIV4=4.7, CGRA4=4.7, BRGE8=4.7, SAPR3=4.6, CSAB4=4.6, CMIG4=4.5, CGRA3=4.5, CCRO3=4.5, POMO3=4.4, FESA3=4.4, VLID3=4.3, TAEE3=4.2, TAEE4=4.2, CSAB3=4.2, ENBR3=4.2, SANB11=4.2, POMO4=4.1, CMIG3=4.1, BGIP4=4.1, FLRY3=4.0, TIMP3=4.0, CAML3=4.0, MRVE3=4.0, PTBL3=3.9, BRAP3=3.8, BRAP4=3.8, PATI3=3.8, HGTX3=3.8, BAZA3=3.8, MERC4=3.8, PETR4=3.8, COCE3=3.8, SANB3=3.6, ELET6=3.5, TGMA3=3.4, GOAU3=3.3, GGBR3=3.3, EMAE4=3.3, HYPE3=3.3, CESP3=3.3, GOAU4=3.2, PTNT3=3.2, EGIE3=3.1, COCE5=3.1, BMKS3=3.0, BRKM5=3.0, NEOE3=3.0, DOHL4=3.0, CESP6=3.0, SHUL4=3.0, ECPR3=2.9, BRKM3=2.9, LIPR3=2.9, JOPA4=2.9, ENMT3=2.9, TEND3=2.9, GGBR4=2.8, EALT4=2.8, UGPA3=2.8, ODPV3=2.8, ARZZ3=2.7, CSMG3=2.7, CLSC4=2.7, CPLE6=2.7, JHSF3=2.7, GRND3=2.7, JOPA3=2.7, ALUP4=2.7, CPLE3=2.6, BGIP3=2.6, ECPR4=2.6, WLMM4=2.6, IRBR3=2.5, ALUP11=2.5, ENGI4=2.5, ECOR3=2.5, MYPK3=2.4, BRKM6=2.4, DOHL3=2.4, LUXM4=2.4, WLMM3=2.4, CRFB3=2.4, ENGI11=2.3, BPAC5=2.3, LLIS3=2.3, USIM5=2.2, BPAC11=2.2, GUAR3=2.2, SBSP3=2.2, RAPT3=2.2, ALUP3=2.2, CLSC3=2.1, MOVI3=2.1, ELET3=2.1, B3SA3=2.1, USIM6=2.0, SULA4=2.0, PARD3=2.0, ELEK4=2.0, COGN3=2.0, PNVL4=1.9, ENGI3=1.9, SMTO3=1.8, LCAM3=1.8, IGTA3=1.8, BPAC3=1.8, CSAN3=1.8, ABEV3=1.8, RAPT4=1.8, DASA3=1.7, ELEK3=1.7, USIM3=1.6, SULA11=1.6, MULT3=1.5, NAFG3=1.4, SUZB3=1.4, NAFG4=1.4, WEGE3=1.4, MPLU3=1.4, PCAR4=1.4, PETR3=1.4, CPFE3=1.3, JPSA3=1.3, PCAR3=1.3, BALM3=1.2, PNVL3=1.2, LREN3=1.1, MDIA3=1.1, SULA3=1.1, SHOW3=1.0, ALSC3=1.0, BALM4=1.0, TRIS3=1.0, EUCA4=1.0, EQTL3=1.0, RENT3=0.9, UNIP6=0.9, UNIP5=0.9, BKBR3=0.9, MSPA3=0.9, MSPA4=0.9, JSLG3=0.8, BAUH4=0.8, BPAN4=0.8, CVCB3=0.8, UNIP3=0.8, OFSA3=0.8, HBTS5=0.8, CELP5=0.7, LIGT3=0.7, EALT3=0.7, HAPV3=0.7, GPCP3=0.7, RANI3=0.7, CELP7=0.6, RADL3=0.6, RANI4=0.6, EUCA3=0.6, NATU3=0.6, MTIG4=0.6, BMEB3=0.5, AALR3=0.5, KEPL3=0.5, MGLU3=0.5, LAME3=0.5, LINX3=0.5, TOTS3=0.4, LOGG3=0.4, LAME4=0.4, BIDI4=0.4, BMIN3=0.3, EZTC3=0.3, CRIV3=0.3, ALSO3=0.3, GUAR4=0.2, SCAR3=0.2, GNDI3=0.2, BIDI11=0.1, STBP3=0.1, EMBR3=0.1, FIGE3=0.1, FIGE4=0.1, BIDI3=0.1, CEBR3=0.1, CEBR6=0.1, SQIA3=0.1, FFTL3=0.0, RPSA4=0.0, FFTL4=0.0, DTCY3=0.0, ESTC11=0.0, OMGE3=0.0, MYPK4=0.0, DJON4=0.0, TBLE5=0.0, TBLE6=0.0, ASSM4=0.0, IDNT3=0.0, ASSM3=0.0, ARTR3=0.0, IGBR3=0.0, IGBR5=0.0, RDCD3=0.0, LATM11=0.0, IGBR6=0.0, ARLA4=0.0, MILK33=0.0, ARLA3=0.0, RSID3=0.0, ABCB3=0.0, BMEF3=0.0, FGUI4=0.0, FGUI3=0.0, RLOG3=0.0, PINE3=0.0, PINE4=0.0, LIXC3=0.0, LIXC4=0.0, EBCO4=0.0, PRTX3=0.0, EBCO3=0.0, REDE4=0.0, KROT4=0.0, AMIL3=0.0, ALBA3=0.0, TKNO4=0.0, BPNM3=0.0, GAZO4=0.0, GAZO3=0.0, LIGH3=0.0, BPHA3=0.0, TMCP4=0.0, TMCP3=0.0, EBTP4=0.0, EBTP3=0.0, TCSL4=0.0, AVIL3=0.0, TCOC4=0.0, TCOC3=0.0, LETO3=0.0, MAPT3=0.0, GOLL4=0.0, MAPT4=0.0, DOCA4=0.0, DOCA3=0.0, MGEL3=0.0, MGEL4=0.0, SEBB3=0.0, SUZB5=0.0, SEBB4=0.0, SUZB6=0.0, RCTB41=0.0, RCTB42=0.0, BTTL3=0.0, CELM3=0.0, BTTL4=0.0, DXTG4=0.0, SUZA4=0.0, MEND6=0.0, DFVA4=0.0, DFVA3=0.0, MEND5=0.0, VVAX4=0.0, VVAX3=0.0, IMBI3=0.0, IMBI4=0.0, AMBV4=0.0, AMBV3=0.0, EBEN4=0.0, GPIV33=0.0, UOLL4=0.0, CLSC6=0.0, CLSC5=0.0, CBEE3=0.0, ALLL4=0.0, ALLL3=0.0, BRTP4=0.0, TOYB3=0.0, APER3=0.0, RAIA3=0.0, BRTP3=0.0, LREN4=0.0, BELG4=0.0, TOYB4=0.0, BELG3=0.0, RCTB31=0.0, RCTB33=0.0, CCHI4=0.0, CCHI3=0.0, CTPC4=0.0, TEKA3=0.0, TEKA4=0.0, LETO5=0.0, MNPR4=0.0, MNPR3=0.0, CTPC3=0.0, HETA4=0.0, HETA3=0.0, LECO4=0.0, LECO3=0.0, TXRX3=0.0, TXRX4=0.0, WEGE4=0.0, ELUM3=0.0, ELUM4=0.0, BAHI3=0.0, BAHI4=0.0, BAHI5=0.0, ALLL11=0.0, CNFB4=0.0, KSSA3=0.0, DUQE3=0.0, DUQE4=0.0, RCSL4=0.0, INEP3=0.0, TRFO3=0.0, TRFO4=0.0, INEP4=0.0, CRPG3=0.0, AGEI3=0.0, BRIV3=0.0, ARTE4=0.0, JBSS3=0.0, ARTE3=0.0, SJOS3=0.0, EVEN3=0.0, SJOS4=0.0, BOBR3=0.0, BOBR4=0.0, TAMM3=0.0, TAMM4=0.0, JBDU4=0.0, JBDU3=0.0, CRTP5=0.0, CRTP3=0.0, DAGB33=0.0, TMAR5=0.0, BICB3=0.0, BICB4=0.0, TMAR3=0.0, TMAR6=0.0, CCPR3=0.0, ETER3=0.0, PLDN4=0.0, UCOP4=0.0, ETER4=0.0, SMLE3=0.0, CAFE3=0.0, CAFE4=0.0, ARCE3=0.0, MNSA4=0.0, MNSA3=0.0, CTIP3=0.0, DHBI4=0.0, DHBI3=0.0, AZUL4=0.0, TEMP3=0.0, ICPI3=0.0, AFLU3=0.0, AFLU5=0.0, SZPQ4=0.0, VAGV4=0.0, RAIL3=0.0, VAGV3=0.0, DMMO3=0.0, BCAL6=0.0, VCPA4=0.0, ACES3=0.0, FBRA4=0.0, ACES4=0.0, PRBC4=0.0, PRBC3=0.0, MMXM3=0.0, ITEC3=0.0, DSUL3=0.0, APTI4=0.0, CREM3=0.0, CREM4=0.0, GFSA3=0.0, BTOW3=0.0, RPMG3=0.0, RPMG4=0.0, AGIN3=0.0, LCSA3=0.0, LCSA4=0.0, SEDU3=0.0, VGOR3=0.0, BRGE12=0.0, VPTA4=0.0, VPTA3=0.0, NORD3=0.0, VULC4=0.0, VULC3=0.0, RDTR3=0.0, RSIP3=0.0, OSXB3=0.0, RSIP4=0.0, DPPI4=0.0, DPPI3=0.0, UBBR11=0.0, PDGR3=0.0, ATOM3=0.0, BERG3=0.0, CCTU4=0.0, VGOR4=0.0, PMET6=0.0, PMET5=0.0, RDNI3=0.0, GETI4=0.0, GETI3=0.0, SLED4=0.0, PMET3=0.0, TSEP4=0.0, SLED3=0.0, TSEP3=0.0, AFLT3=0.0, CEGR3=0.0, IENG3=0.0, PMAM4=0.0, PMAM3=0.0, SNSY5=0.0, CEPE3=0.0, CALI3=0.0, CPRE3=0.0, PEFX5=0.0, MNDL4=0.0, MNDL3=0.0, PEFX3=0.0, BRGE3=0.0, BRGE5=0.0, DAYC4=0.0, DAYC3=0.0, CNTO3=0.0, FRTA3=0.0, IENG5=0.0, PFRM3=0.0, BECE3=0.0, TANC4=0.0, TLCP4=0.0, BECE4=0.0, TLCP3=0.0, INHA3=0.0, CEAB3=0.0, MLFT4=0.0, VNET3=0.0, BEEF3=0.0, CLAN4=0.0, CLAN3=0.0, CFLU4=0.0, HBOR3=0.0, ADHM3=0.0, PNOR6=0.0, PNOR5=0.0, FRIO3=0.0, VALE5=0.0, VIVA3=0.0, TSPP3=0.0, TSPP4=0.0, LPSB3=0.0, VALE3=0.0, LOGN3=0.0, AUTM3=0.0, CMMA4=0.0, ILLS4=0.0, ENEV3=0.0, BIOM3=0.0, BIOM4=0.0, CBMA4=0.0, MRFG3=0.0, CBMA3=0.0, TROR3=0.0, TROR4=0.0, CIQU4=0.0, CIQU3=0.0, PORP4=0.0, ALPA3=0.0, LGLO4=0.0, MEDI3=0.0, SEMP3=0.0, ALPA4=0.0, GALO4=0.0, FCAP4=0.0, GALO3=0.0, CYRE4=0.0, BMGB11=0.0, BUET3=0.0, ANIM3=0.0, BUET4=0.0, FCAP3=0.0, CEED3=0.0, MMAQ3=0.0, CEED4=0.0, KROT11=0.0, TERI3=0.0, BNCA3=0.0, ENER6=0.0, PTBL4=0.0, ENER3=0.0, ENER5=0.0, MILS3=0.0, BSCT3=0.0, CGOS3=0.0, BSCT5=0.0, BSCT6=0.0, CGOS4=0.0, UCAS3=0.0, ELPL3=0.0, ELPL4=0.0, ELPL5=0.0, ELPL6=0.0, CEEB5=0.0, CTKA4=0.0, CTKA3=0.0, UGPA4=0.0, TNCP3=0.0, TNCP4=0.0, ELEV3=0.0, BSEV3=0.0, BBTG11=0.0, BBTG13=0.0, BBTG12=0.0, TDBH4=0.0, TDBH3=0.0, RJCP3=0.0, TPIS3=0.0, CRUZ3=0.0, HOOT4=0.0, PLIM4=0.0, POPR4=0.0, AEDU3=0.0, BRSR4=0.0, ELET5=0.0, SFSA3=0.0, SFSA4=0.0, WMBY3=0.0, HGTX4=0.0, BPIA3=0.0, FBMC3=0.0, SLCP3=0.0, FBMC4=0.0, CCIM3=0.0, IMCH3=0.0, TPRC3=0.0, TNEP3=0.0, TNEP4=0.0, TPRC6=0.0, BDLL4=0.0, BDLL3=0.0, UBBR3=0.0, UBBR4=0.0, ECIS3=0.0, TMGC7=0.0, ECIS4=0.0, PLTO6=0.0, PLTO5=0.0, VINE5=0.0, VINE3=0.0, OSAO4=0.0, PTQS4=0.0, JFAB4=0.0, IVTT3=0.0, ILMD3=0.0, ILMD4=0.0, MRSL4=0.0, MRSL3=0.0, BHGR3=0.0, SCAR4=0.0, MAGG3=0.0, SGEN3=0.0, GRNL4=0.0, SGEN4=0.0, IDVL3=0.0, IDVL4=0.0, IGUA6=0.0, IGUA5=0.0, IGUA3=0.0, CTWR3=0.0, AZEV3=0.0, SALM3=0.0, SALM4=0.0, AZEV4=0.0, TCNO4=0.0, TCNO3=0.0, TMGC3=0.0, BRFS3=0.0, BSGR3=0.0, CCXC3=0.0, GAFP3=0.0, GBIO33=0.0, TENE5=0.0, TENE7=0.0, BESP3=0.0, BESP4=0.0, GAFP4=0.0, FLCL3=0.0, FLCL6=0.0, FLCL5=0.0, CRBM7=0.0, TELB3=0.0, TELB4=0.0, CRBM3=0.0, GLOB4=0.0, OIBR4=0.0, OIBR3=0.0, CZLT33=0.0, VIVR3=0.0, PRML3=0.0, AMAR3=0.0, VIGR3=0.0, CORR3=0.0, PRGA4=0.0, SPRI6=0.0, SPRI5=0.0, VIVO4=0.0, TECN3=0.0, RGEG3=0.0, ABYA3=0.0, VIVO3=0.0, REEM4=0.0, RPAD3=0.0, CORR4=0.0, JFEN3=0.0, RPAD6=0.0, BNBR4=0.0, CZRS3=0.0, AESL3=0.0, AESL4=0.0, LUXM3=0.0, CSPC4=0.0, CZRS4=0.0, CSPC3=0.0, SPRI3=0.0, REPA3=0.0, TUPY4=0.0, ESTR3=0.0, REPA4=0.0, FRAS4=0.0, ESTR4=0.0, MLPA3=0.0, AHEB5=0.0, MLPA4=0.0, CESP4=0.0, PRIO3=0.0, AHEB6=0.0, VPSC3=0.0, VPSC4=0.0, PRVI3=0.0, ROMI4=0.0, AMPI3=0.0, AHEB3=0.0, MSAN4=0.0, MSAN3=0.0, RSUL4=0.0, BISA3=0.0, NUTR3=0.0, BEMA3=0.0, SEBB11=0.0, TMGC11=0.0, AEDU11=0.0, TMGC13=0.0, TMGC12=0.0, MLPA12=0.0, CTSA8=0.0, ASTA4=0.0, PLAS3=0.0, DURA4=0.0, DURA3=0.0, RNPT3=0.0, RNPT4=0.0, ELCA4=0.0, ELCA3=0.0, TVIT3=0.0, BFIT3=0.0, BFIT4=0.0, TCSA3=0.0, LUPA3=0.0, SCLO4=0.0, SCLO3=0.0, GVTT3=0.0, IDVL11=0.0, SUBA3=0.0, MARI3=0.0, SDIA4=0.0, SDIA3=0.0, RNEW3=0.0, RNEW4=0.0, STBP11=0.0, PALF11=0.0, SULT3=0.0, TNLP3=0.0, POSI3=0.0, TNLP4=0.0, SULT4=0.0, CEDO3=0.0, CEDO4=0.0, CPSL3=0.0, MTBR3=0.0, MTBR4=0.0, CSTB4=0.0, CSTB3=0.0, CPFP4=0.0, TEFC11=0.0, CRDE3=0.0, RNEW11=0.0, FHER3=0.0, NETC4=0.0, NETC3=0.0, MAGS3=0.0, PALF5=0.0, PALF3=0.0, LEVE4=0.0, ARPS3=0.0, STRP4=0.0, SGPS3=0.0, HAGA4=0.0, HAGA3=0.0, OGXP3=0.0, AGEN33=0.0, BBRK3=0.0, FTRX3=0.0, MWET4=0.0, MWET3=0.0, FTRX4=0.0, BMTO4=0.0, RHDS4=0.0, BMTO3=0.0, RHDS3=0.0, DUFB11=0.0, AELP3=0.0, VVAR11=0.0, PITI4=0.0, ESCE3=0.0, PTPA3=0.0, PTPA4=0.0, TESA3=0.0, RIPI4=0.0, RIPI3=0.0, LIQO3=0.0, CMET4=0.0, ARCZ3=0.0, ARCZ6=0.0, WISA4=0.0, ARPS4=0.0, WISA3=0.0, VVAR4=0.0, VVAR3=0.0, BOVH3=0.0, CTNM4=0.0, CTNM3=0.0, PQUN3=0.0, PQUN4=0.0, LATS3=0.0, VTLM3=0.0, ESTC4=0.0, CPFG3=0.0, CPFG4=0.0, CASN3=0.0, LFFE4=0.0, LFFE3=0.0, MERC3=0.0, PCAR5=0.0, TARP11=0.0, FJTA4=0.0, FJTA3=0.0, SASG3=0.0, PTIP3=0.0, PTIP4=0.0, BRPR3=0.0, CAMB3=0.0, CPNY3=0.0, CAMB4=0.0, BAHI11=0.0, COCE6=0.0}";
		
		// Act
		String[] tokens = SpreadSheetWriter.splitTickerValuePairs(fullData);
		
		//Assert
		assertNotNull(tokens);
		assertEquals(875, tokens.length);
	}

}
