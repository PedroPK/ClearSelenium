package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.getElementByXPath;

import java.math.BigDecimal;

import org.openqa.selenium.WebElement;

import lombok.Data;

@Data
public class FundamentalistIndicators {
	
	/************************************************************************/
	 // First Column
	/************************************************************************/
	
	/**
	 * Preço sobre Lucro
	 * 
	 * Preço da ação dividido pelo lucro por ação. 
	 * O P/L é o número de anos que se levaria para reaver o capital aplicado na compra de uma ação, 
	 * através do recebimento do lucro gerado pela empresa, considerando que esses lucros permaneçam constantes.
	 */
	public static final		String			PRICE_OVER_PROFIT_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[2]/td[4]/span";
	private					BigDecimal		aPriceOverProfit;
	
	public static String getPriceOverProfit() {
		WebElement dividendYieldWebElement = getElementByXPath(PRICE_OVER_PROFIT_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	
	
	/**
	 * Preço sobre Valor Patrimonial
	 * 
	 * Preço da ação dividido pelo Valor Patrimonial por ação. 
	 * Informa quanto o mercado está disposto a pagar sobre o Patrimônio Líquido da empresa
	 */
	public static final		String			PRICE_OVER_BOOK_VALUE_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[3]/td[4]/span";
	private					BigDecimal		aPriveOverBookValue;
	
	public static String getPriceOverBookValue() {
		WebElement dividendYieldWebElement = getElementByXPath(PRICE_OVER_BOOK_VALUE_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Preço sobre EBIT
	 * 
	 * Preço da ação dividido pelo EBIT por ação. EBIT é o Lucro antes dos Impostos e Despesas Financeiras. 
	 * É uma boa aproximação do lucro operacional da empresa.
	 */
	public static final		String			PRICE_OVER_EBIT_XPATH				=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[4]/td[4]/span";
	private					BigDecimal		aPriceOverEBIT;
	
	public static String getPriceOverEbit() {
		WebElement dividendYieldWebElement = getElementByXPath(PRICE_OVER_EBIT_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Price Sales Ratio: Preço da ação dividido pela Receita Líquida por ação
	 */
	public static final		String			PRICE_SALES_RATIO_XPATH					=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[5]/td[4]/span";
	private					BigDecimal		aPriceSalesRatio;
	
	public static String getPriceSalesRatio() {
		WebElement dividendYieldWebElement = getElementByXPath(PRICE_SALES_RATIO_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Preço sobre Ativos
	 * 
	 * Preço da ação dividido pelos Ativos totais por ação.
	 */
	public static final		String			PRICE_OVER_ASSETS_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[6]/td[4]/span";
	private					BigDecimal		aPriceOverAsset;
	
	public static String getPriceOverAssets() {
		WebElement dividendYieldWebElement = getElementByXPath(PRICE_OVER_ASSETS_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Preço sobre Capital de Giro
	 * 
	 * Preço da ação dividido pelo capital de giro por ação. Capital de giro é o Ativo Circulante menos Passivo Circulante
	 */
	public static final		String			PRICE_OVER_WORKING_CAPITAL_XPATH	=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[7]/td[4]/span";
	private					BigDecimal		aPriveOverWorkingCapital;
	
	public static String getPriceOverWorkingCapital() {
		WebElement dividendYieldWebElement = getElementByXPath(PRICE_OVER_WORKING_CAPITAL_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Preço sobre o Ativo Circulante Líquido
	 * 
	 * Preço da ação dividido pelos Ativos Circulantes Líquidos por ação. 
	 * Ativo Circ. Líq. é obtido subtraindo os ativos circulantes pelas dívidas de curto e longo prazo, ou seja, 
	 * após o pagamento de todas as dívidas, quanto sobraria dos ativos mais líquidos da empresa (caixa, estoque, etc)
	 */
	public static final		String			PRICE_OVER_NET_CURRENT_ASSET_XPATH	=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[8]/td[4]/span";
	private					BigDecimal		aPriveOverNetCurrentAsset;
	
	public static String getPriceOverNetCurretAsset() {
		WebElement dividendYieldWebElement = getElementByXPath(PRICE_OVER_NET_CURRENT_ASSET_XPATH);
		return dividendYieldWebElement.getText();
	}
	/**
	 * Dividend Yield
	 * 
	 * Dividendo pago por ação dividido pelo preço da ação. É o rendimento gerado para o dono da ação pelo pagamento de dividendos.
	 */
	public static final		String			DIVIDEND_YIELD_XPATH						=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[9]/td[4]/span";
	private					BigDecimal		aDividendYield;
	
	public static String getDividendYieldTextValue() {
		WebElement dividendYieldWebElement = getElementByXPath(DIVIDEND_YIELD_XPATH);
		
		String dividendYieldTextValue = dividendYieldWebElement.getText();
		return dividendYieldTextValue;
	}
	
	/**
	 * Valor da Firma (Enterprise Value dividido pelo EBIT.
	 */
	public static final		String			ENTERPRISE_VALUE_OVER_EBIT_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[10]/td[4]/span";
	private					BigDecimal		aEnterpriseValueOverEBIT;
	
	public static String getEnterpriseValueOverEbit() {
		WebElement dividendYieldWebElement = getElementByXPath(ENTERPRISE_VALUE_OVER_EBIT_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Giro do Ativo
	 * 
	 * Receita Líquida dividido por Ativos Totais. 
	 * Indica a eficiência com a qual a empresa usa seus ativos para gerar vendas
	 */
	public static final		String			ASSET_TURNOVER_XPATH						=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[11]/td[4]/span";
	private					BigDecimal		aAssetTurnover;
	
	public static String getAssetTurnover() {
		WebElement dividendYieldWebElement = getElementByXPath(ASSET_TURNOVER_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Crescimento da Receita Líquida nos últimos 5 anos
	 */
	public static final		String			INCOME_GROWTH_LAST_5_YEARS_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[12]/td[4]/span";
	private					BigDecimal		aIncomeGrowthLast5Years;
	
	public static String getIncomeGrowthLast5Years() {
		WebElement dividendYieldWebElement = getElementByXPath(INCOME_GROWTH_LAST_5_YEARS_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/************************************************************************/
	 // Second Column
	/************************************************************************/
	
	
	/**
	 * Lucro por Ação
	 */
	public static final		String			PROFIT_PER_ACTION_XPATH						=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[2]/td[6]/span";
	private					BigDecimal		aProfitPerAction;
	
	public static String getProfitPerAction() {
		WebElement dividendYieldWebElement = getElementByXPath(PROFIT_PER_ACTION_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Valor Patrimonial por Ação: Valor do Patrimônio Líquido dividido pelo número total de ações.
	 */
	public static final		String			BOOK_VALUE_OVER_STOCKS_XPATH				=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[3]/td[6]/span";
	private					BigDecimal		aBookValueOverStocks;
	
	public static String getBookValueOverStocks() {
		WebElement dividendYieldWebElement = getElementByXPath(BOOK_VALUE_OVER_STOCKS_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Margem Bruta
	 * 
	 * Lucro Bruto dividido pela Receita Líquida: Indica a porcentagem de cada R$1 de venda que sobrou após o custo dos produtos/serviços vendidos
	 */
	public static final		String			GROSS_MARGIN_XPATH							=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[4]/td[6]/span";
	private					BigDecimal		aGrossMargin;
	
	public static String getGrossMargin() {
		WebElement dividendYieldWebElement = getElementByXPath(GROSS_MARGIN_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Margem EBIT
	 * 
	 * EBIT dividido pela Receita Líquida: 
	 * 		Indica a porcentagem de cada R$1 de venda que sobrou após o pagamento dos custos dos produtos/serviços vendidos, 
	 * 		das despesas com vendas, gerais e administrativas
	 * 
	 * Operational Margin		-		Operation income margin		-		Operating Profit Margin		-		Return of Sales (ROS)
	 */
	public static final		String			EBIT_MARGIN_XPATH							=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[5]/td[6]/span";
	private					BigDecimal		aEbitMargin;
	
	public static String getEbitMargin() {
		WebElement dividendYieldWebElement = getElementByXPath(EBIT_MARGIN_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	
	/**
	 * Margem Líquida
	 * 
	 * Lucro Líquido dividido pela Receita Líquida
	 * 
	 * Profit Margin		-		Net Margin		-		Net Profit Margin		-		Net Profit Ratio
	 */
	public static final		String			NET_MARGIN_XPATH							=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[6]/td[6]/span";
	private					BigDecimal		aNetMargin;
	
	public static String getNetMargin() {
		WebElement dividendYieldWebElement = getElementByXPath(NET_MARGIN_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * EBIT / Ativo
	 * 
	 * EBIT dividido por Ativos totais
	 */
	public static final		String			EBIT_OVER_ASSET_XPATH						=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[7]/td[6]/span";
	private					BigDecimal		aEbitOverAsset;
	
	public static String getEvitOverAsset() {
		WebElement ebitOverAsset_WebElement		=	getElementByXPath(EBIT_OVER_ASSET_XPATH);
		return	ebitOverAsset_WebElement.getText();
	}
	
	/**
	 * Return over Invested Capital
	 * 
	 * Retorno sobre o Capital Investido: Calculado dividindo-se o EBIT por (Ativos - Fornecedores - Caixa). Informa o retorno que a empresa consegue sobre o capital total aplicado.
	 */
	public static final		String			RETURN_OVER_INVESTED_CAPITAL_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[8]/td[6]/span";
	private					BigDecimal		aReturnOrverInvestedCapital;
	
	public static String getReturnOverInvestedCapital() {
		WebElement dividendYieldWebElement = getElementByXPath(RETURN_OVER_INVESTED_CAPITAL_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * ROE - Return on Equity
	 * 
	 * Retorno sobre o Patrimônio Líquido: Lucro líquido dividido pelo Patrimônio Líquido
	 */
	public static final		String			RETURN_ON_EQUITY_XPATH						=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[9]/td[6]/span";
	private					BigDecimal		aReturnOnEquity;
	
	public static String getReturnOverEquity() {
		WebElement dividendYieldWebElement = getElementByXPath(RETURN_ON_EQUITY_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Liquidez Corrente
	 * 
	 * Ativo Circulante dividido pelo Passivo Circulante: Reflete a capacidade de pagamento da empresa no curto prazo.
	 * 
	 *  Current Liquity		-		Current Ratio		-		Liquidity Ratio
	 */
	public static final		String			CURRENT_LIQUIDITY_XPATH						=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[10]/td[6]/span";
	private					BigDecimal		aCurrentLiquidity;
	
	public static String getCurrentLiquidity() {
		WebElement dividendYieldWebElement = getElementByXPath(CURRENT_LIQUIDITY_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Dívida Bruta sobre Patrimônio Líquido
	 * 
	 * Dívida Bruta total (Dívida+Debêntures) dividido pelo Patrimônio Líquido
	 * 
	 * Debt to Equity Ratio
	 */
	public static final		String			GROSS_DEBT_OVER_EQUITY_XPATH					=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[11]/td[6]/span";
	private					BigDecimal		aGrossDebtOverEquityRatio;
	
	public static String getGrossDebtOverEquity() {
		WebElement dividendYieldWebElement = getElementByXPath(GROSS_DEBT_OVER_EQUITY_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	
	
}