package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.getElementByXPath;

import java.math.BigDecimal;

import org.openqa.selenium.WebElement;

import lombok.Data;

@Data
public abstract class FundamentalistIndicators {
	
	/************************************************************************/
	 // First Column
	/************************************************************************/
	
	/**
	 * Preço sobre Lucro (P/L)
	 * 
	 * Preço da ação dividido pelo lucro por ação. 
	 * O P/L é o número de anos que se levaria para reaver o capital aplicado na compra de uma ação, 
	 * através do recebimento do lucro gerado pela empresa, considerando que esses lucros permaneçam constantes.
	 */
	private					BigDecimal		aPriceOverProfit;
	
	public String getPriceOverProfit() {
		WebElement dividendYieldWebElement = getElementByXPath( getPriceOverProfit_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getPriceOverProfit_XPath();
	
	
	
	/**
	 * Preço sobre Valor Patrimonial (P/VP)
	 * 
	 * Preço da ação dividido pelo Valor Patrimonial por ação. 
	 * Informa quanto o mercado está disposto a pagar sobre o Patrimônio Líquido da empresa
	 */
	private					BigDecimal		aPriveOverBookValue;
	
	protected String getPriceOverBookValue() {
		WebElement dividendYieldWebElement = getElementByXPath( getPriceOverBookValue_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getPriceOverBookValue_XPath();
	
	/**
	 * Preço sobre EBIT
	 * 
	 * Preço da ação dividido pelo EBIT por ação. EBIT é o Lucro antes dos Impostos e Despesas Financeiras. 
	 * É uma boa aproximação do lucro operacional da empresa.
	 */
	private					BigDecimal		aPriceOverEBIT;
	
	protected String getPriceOverEbit() {
		WebElement dividendYieldWebElement = getElementByXPath( getPriceOverEBIT_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getPriceOverEBIT_XPath();
	
	/**
	 * Price Sales Ratio: Preço da ação dividido pela Receita Líquida por ação
	 */
	private					BigDecimal		aPriceSalesRatio;
	
	protected String getPriceSalesRatio() {
		WebElement dividendYieldWebElement = getElementByXPath( getPriceSalesRatio_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getPriceSalesRatio_XPath();
	
	/**
	 * Preço sobre Ativos
	 * 
	 * Preço da ação dividido pelos Ativos totais por ação.
	 */
	private					BigDecimal		aPriceOverAsset;
	
	protected String getPriceOverAssets() {
		WebElement dividendYieldWebElement = getElementByXPath( getPriceOverAssets_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getPriceOverAssets_XPath();
	
	/**
	 * Preço sobre Capital de Giro
	 * 
	 * Preço da ação dividido pelo capital de giro por ação. Capital de giro é o Ativo Circulante menos Passivo Circulante
	 */
	private					BigDecimal		aPriveOverWorkingCapital;
	
	protected String getPriceOverWorkingCapital() {
		WebElement dividendYieldWebElement = getElementByXPath( getPriceOverWorkingCapital_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getPriceOverWorkingCapital_XPath();
	
	/**
	 * Preço sobre o Ativo Circulante Líquido
	 * 
	 * Preço da ação dividido pelos Ativos Circulantes Líquidos por ação. 
	 * Ativo Circ. Líq. é obtido subtraindo os ativos circulantes pelas dívidas de curto e longo prazo, ou seja, 
	 * após o pagamento de todas as dívidas, quanto sobraria dos ativos mais líquidos da empresa (caixa, estoque, etc)
	 */
	private					BigDecimal		aPriveOverNetCurrentAsset;
	
	protected String getPriceOverNetCurretAsset() {
		WebElement dividendYieldWebElement = getElementByXPath( getPriceOverNetCurrentAsset_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getPriceOverNetCurrentAsset_XPath();
	
	/**
	 * Dividend Yield
	 * 
	 * Dividendo pago por ação dividido pelo preço da ação. É o rendimento gerado para o dono da ação pelo pagamento de dividendos.
	 */
	private					BigDecimal		aDividendYield;
	
	protected String getDividendYieldTextValue() {
		WebElement dividendYieldWebElement = getElementByXPath( getDividentYield_XPath() );
		
		String dividendYieldTextValue = dividendYieldWebElement.getText();
		return dividendYieldTextValue;
	}
	protected abstract String getDividentYield_XPath();
	
	/**
	 * Valor da Firma (Enterprise Value dividido pelo EBIT.
	 */
	private					BigDecimal		aEnterpriseValueOverEBIT;
	
	protected String getEnterpriseValueOverEbit() {
		WebElement dividendYieldWebElement = getElementByXPath( getEnterpriseValueOverEBIT_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getEnterpriseValueOverEBIT_XPath();
	
	/**
	 * Giro do Ativo
	 * 
	 * Receita Líquida dividido por Ativos Totais. 
	 * Indica a eficiência com a qual a empresa usa seus ativos para gerar vendas
	 */
	private					BigDecimal		aAssetTurnover;
	
	protected String getAssetTurnover() {
		WebElement dividendYieldWebElement = getElementByXPath( getAssetTurnover_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getAssetTurnover_XPath();
	
	/**
	 * Crescimento da Receita Líquida nos últimos 5 anos
	 */
	private					BigDecimal		aIncomeGrowthLast5Years;
	
	protected String getIncomeGrowthLast5Years() {
		WebElement dividendYieldWebElement = getElementByXPath( getIncomeGrowthLast5Years_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getIncomeGrowthLast5Years_XPath();
	
	/************************************************************************/
	 // Second Column
	/************************************************************************/
	
	
	/**
	 * Lucro por Ação
	 */
	private					BigDecimal		aProfitPerAction;
	
	protected String getProfitPerAction() {
		WebElement dividendYieldWebElement = getElementByXPath( getProfitPerAction_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getProfitPerAction_XPath();
	
	/**
	 * Valor Patrimonial por Ação: Valor do Patrimônio Líquido dividido pelo número total de ações.
	 */
	private					BigDecimal		aBookValueOverStocks;
	
	protected String getBookValueOverStocks() {
		WebElement dividendYieldWebElement = getElementByXPath( getBookValueOverStocks_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getBookValueOverStocks_XPath();
	
	/**
	 * Margem Bruta
	 * 
	 * Lucro Bruto dividido pela Receita Líquida: Indica a porcentagem de cada R$1 de venda que sobrou após o custo dos produtos/serviços vendidos
	 */
	private					BigDecimal		aGrossMargin;
	
	protected String getGrossMargin() {
		WebElement dividendYieldWebElement = getElementByXPath( getGrossMargin_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getGrossMargin_XPath();
	
	/**
	 * Margem EBIT
	 * 
	 * EBIT dividido pela Receita Líquida: 
	 * 		Indica a porcentagem de cada R$1 de venda que sobrou após o pagamento dos custos dos produtos/serviços vendidos, 
	 * 		das despesas com vendas, gerais e administrativas
	 * 
	 * Operational Margin		-		Operation income margin		-		Operating Profit Margin		-		Return of Sales (ROS)
	 */
	private					BigDecimal		aEbitMargin;
	
	protected String getEbitMargin() {
		WebElement dividendYieldWebElement = getElementByXPath( getEbitMargin_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getEbitMargin_XPath();
	
	/**
	 * Margem Líquida
	 * 
	 * Lucro Líquido dividido pela Receita Líquida
	 * 
	 * Profit Margin		-		Net Margin		-		Net Profit Margin		-		Net Profit Ratio
	 */
	private					BigDecimal		aNetMargin;
	
	protected String getNetMargin() {
		WebElement dividendYieldWebElement = getElementByXPath( getNetMargin_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getNetMargin_XPath();
	
	/**
	 * EBIT / Ativo
	 * 
	 * EBIT dividido por Ativos totais
	 */
	private					BigDecimal		aEbitOverAsset;
	
	protected String getEbitOverAsset() {
		WebElement ebitOverAsset_WebElement		=	getElementByXPath( getEbitOverAsset_XPath() );
		return	ebitOverAsset_WebElement.getText();
	}
	protected abstract String getEbitOverAsset_XPath();
	
	/**
	 * Return over Invested Capital
	 * 
	 * Retorno sobre o Capital Investido: Calculado dividindo-se o EBIT por (Ativos - Fornecedores - Caixa). Informa o retorno que a empresa consegue sobre o capital total aplicado.
	 */
	private					BigDecimal		aReturnOrverInvestedCapital;
	
	protected String getReturnOverInvestedCapital() {
		WebElement dividendYieldWebElement = getElementByXPath( getReturnOverInvestedCapital_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getReturnOverInvestedCapital_XPath();
	
	/**
	 * ROE - Return on Equity
	 * 
	 * Retorno sobre o Patrimônio Líquido: Lucro líquido dividido pelo Patrimônio Líquido
	 */
	private					BigDecimal		aReturnOnEquity;
	
	protected String getReturnOverEquity() {
		WebElement dividendYieldWebElement = getElementByXPath( getReturnOverEquity_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getReturnOverEquity_XPath();
	
	/**
	 * Liquidez Corrente
	 * 
	 * Ativo Circulante dividido pelo Passivo Circulante: Reflete a capacidade de pagamento da empresa no curto prazo.
	 * 
	 *  Current Liquity		-		Current Ratio		-		Liquidity Ratio
	 */
	private					BigDecimal		aCurrentLiquidity;
	
	protected String getCurrentLiquidity() {
		WebElement dividendYieldWebElement = getElementByXPath( getCurrentLiquidity_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getCurrentLiquidity_XPath();
	
	/**
	 * Dívida Bruta sobre Patrimônio Líquido
	 * 
	 * Dívida Bruta total (Dívida+Debêntures) dividido pelo Patrimônio Líquido
	 * 
	 * Debt to Equity Ratio
	 */
	private					BigDecimal		aGrossDebtOverEquityRatio;
	
	protected String getGrossDebtOverEquity() {
		WebElement dividendYieldWebElement = getElementByXPath( getGrossDebtOverEquity_XPath() );
		return dividendYieldWebElement.getText();
	}
	protected abstract String getGrossDebtOverEquity_XPath();
	
}