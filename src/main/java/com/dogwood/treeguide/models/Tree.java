package com.dogwood.treeguide.models;


import javax.persistence.*;

@Entity
@Table(name = "tree_info")
public class Tree {

    @Id
    @Column(name = "accepted_symbol", unique = true)
    private String acceptedSymbol;

    @Column(name = "scientific_name")
    private String scientificName;

    @Column(name = "common_name")
    private String commonName;

    @Column(name = "family_common_name")
    private String familyCommonName;

    @Column(name = "growth_habit")
    private String growthHabit;

    @Column(name = "active_growth_period")
    private String activeGrowthPeriod;

    @Column(name = "fall_conspicuous")
    private String fallConspicuous;

    @Column(name = "flower_color")
    private String flowerColor;

    @Column(name = "flower_conspicuous")
    private String flowerConspicuous;

    @Column(name = "foliage_color")
    private String foliageColor;

    @Column(name = "foliage_texture")
    private String foliageTexture;

    @Column(name = "fruit_conspicuous")
    private String fruitConspicuous;

    @Column(name = "growth_form")
    private String growthForm;

    @Column(name = "base_age_height")
    private String baseAgeHeight;

    @Column(name = "mature_height")
    private String matureHeight;

    @Column(name = "leaf_retention")
    private String leafRetention;

    @Column(name = "lifespan")
    private String lifespan;

    @Column(name = "shape_orientation")
    private String shapeOrientation;

    @Column(name = "toxicity")
    private String toxicity;

    @Column(name = "coarse_soil")
    private String coarseSoil;

    @Column(name = "medium_soil")
    private String mediumSoil;

    @Column(name = "fine_soil")
    private String fineSoil;

    @Column(name = "drought_tolerance")
    private String droughtTolerance;

    @Column(name = "moisture_use")
    private String moistureUse;

    @Column(name = "minimum_precipitation")
    private String minimumPrecipitation;

    @Column(name = "maximum_precipitation")
    private String maximumPrecipitation;

    @Column(name = "minimum_root_depth")
    private String minimumRootDepth;

    @Column(name = "shade_tolerance")
    private String shadeTolerance;

    @Column(name = "bloom_period")
    private String bloomPeriod;

    @Column(name = "fruit_seed_abundance")
    private String fruitSeedAbundance;

    @Column(name = "fruit_nut_period_begin")
    private String fruitNutPeriodBegin;

    @Column(name = "fruit_nut_period_end")
    private String fruitNutPeriodEnd;

    @Column(name = "fruit_seed_persistence")
    private String fruitSeedPersistence;

    @Column(name = "berry_nut_seed_product")
    private String berryNutSeedProduct;

    @Column(name = "fodder_product")
    private String fodderProduct;

    @Column(name = "palatable_human")
    private String palatableHuman;

    public Tree(String acceptedSymbol, String scientificName, String commonName, String familyCommonName, String growthHabit, String activeGrowthPeriod, String fallConspicuous, String flowerColor, String flowerConspicuous, String foliageColor, String foliageTexture, String fruitConspicuous, String growthForm, String baseAgeHeight, String matureHeight, String leafRetention, String lifespan, String shapeOrientation, String toxicity, String coarseSoil, String mediumSoil, String fineSoil, String droughtTolerance, String moistureUse, String minimumPrecipitation, String maximumPrecipitation, String minimumRootDepth, String shadeTolerance, String bloomPeriod, String fruitSeedAbundance, String fruitNutPeriodBegin, String fruitNutPeriodEnd, String fruitSeedPersistence, String berryNutSeedProduct, String fodderProduct, String palatableHuman) {
        this.acceptedSymbol = acceptedSymbol;
        this.scientificName = scientificName;
        this.commonName = commonName;
        this.familyCommonName = familyCommonName;
        this.growthHabit = growthHabit;
        this.activeGrowthPeriod = activeGrowthPeriod;
        this.fallConspicuous = fallConspicuous;
        this.flowerColor = flowerColor;
        this.flowerConspicuous = flowerConspicuous;
        this.foliageColor = foliageColor;
        this.foliageTexture = foliageTexture;
        this.fruitConspicuous = fruitConspicuous;
        this.growthForm = growthForm;
        this.baseAgeHeight = baseAgeHeight;
        this.matureHeight = matureHeight;
        this.leafRetention = leafRetention;
        this.lifespan = lifespan;
        this.shapeOrientation = shapeOrientation;
        this.toxicity = toxicity;
        this.coarseSoil = coarseSoil;
        this.mediumSoil = mediumSoil;
        this.fineSoil = fineSoil;
        this.droughtTolerance = droughtTolerance;
        this.moistureUse = moistureUse;
        this.minimumPrecipitation = minimumPrecipitation;
        this.maximumPrecipitation = maximumPrecipitation;
        this.minimumRootDepth = minimumRootDepth;
        this.shadeTolerance = shadeTolerance;
        this.bloomPeriod = bloomPeriod;
        this.fruitSeedAbundance = fruitSeedAbundance;
        this.fruitNutPeriodBegin = fruitNutPeriodBegin;
        this.fruitNutPeriodEnd = fruitNutPeriodEnd;
        this.fruitSeedPersistence = fruitSeedPersistence;
        this.berryNutSeedProduct = berryNutSeedProduct;
        this.fodderProduct = fodderProduct;
        this.palatableHuman = palatableHuman;
    }

    public Tree() {    }

    public String getAcceptedSymbol() {
        return acceptedSymbol;
    }

    public void setAcceptedSymbol(String acceptedSymbol) {
        this.acceptedSymbol = acceptedSymbol;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getFamilyCommonName() {
        return familyCommonName;
    }

    public void setFamilyCommonName(String familyCommonName) {
        this.familyCommonName = familyCommonName;
    }

    public String getGrowthHabit() {
        return growthHabit;
    }

    public void setGrowthHabit(String growthHabit) {
        this.growthHabit = growthHabit;
    }

    public String getActiveGrowthPeriod() {
        return activeGrowthPeriod;
    }

    public void setActiveGrowthPeriod(String activeGrowthPeriod) {
        this.activeGrowthPeriod = activeGrowthPeriod;
    }

    public String getFallConspicuous() {
        return fallConspicuous;
    }

    public void setFallConspicuous(String fallConspicuous) {
        this.fallConspicuous = fallConspicuous;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getFlowerConspicuous() {
        return flowerConspicuous;
    }

    public void setFlowerConspicuous(String flowerConspicuous) {
        this.flowerConspicuous = flowerConspicuous;
    }

    public String getFoliageColor() {
        return foliageColor;
    }

    public void setFoliageColor(String foliageColor) {
        this.foliageColor = foliageColor;
    }

    public String getFoliageTexture() {
        return foliageTexture;
    }

    public void setFoliageTexture(String foliageTexture) {
        this.foliageTexture = foliageTexture;
    }

    public String getFruitConspicuous() {
        return fruitConspicuous;
    }

    public void setFruitConspicuous(String fruitConspicuous) {
        this.fruitConspicuous = fruitConspicuous;
    }

    public String getGrowthForm() {
        return growthForm;
    }

    public void setGrowthForm(String growthForm) {
        this.growthForm = growthForm;
    }

    public String getBaseAgeHeight() {
        return baseAgeHeight;
    }

    public void setBaseAgeHeight(String baseAgeHeight) {
        this.baseAgeHeight = baseAgeHeight;
    }

    public String getMatureHeight() {
        return matureHeight;
    }

    public void setMatureHeight(String matureHeight) {
        this.matureHeight = matureHeight;
    }

    public String getLeafRetention() {
        return leafRetention;
    }

    public void setLeafRetention(String leafRetention) {
        this.leafRetention = leafRetention;
    }

    public String getLifespan() {
        return lifespan;
    }

    public void setLifespan(String lifespan) {
        this.lifespan = lifespan;
    }

    public String getShapeOrientation() {
        return shapeOrientation;
    }

    public void setShapeOrientation(String shapeOrientation) {
        this.shapeOrientation = shapeOrientation;
    }

    public String getToxicity() {
        return toxicity;
    }

    public void setToxicity(String toxicity) {
        this.toxicity = toxicity;
    }

    public String getCoarseSoil() {
        return coarseSoil;
    }

    public void setCoarseSoil(String coarseSoil) {
        this.coarseSoil = coarseSoil;
    }

    public String getMediumSoil() {
        return mediumSoil;
    }

    public void setMediumSoil(String mediumSoil) {
        this.mediumSoil = mediumSoil;
    }

    public String getFineSoil() {
        return fineSoil;
    }

    public void setFineSoil(String fineSoil) {
        this.fineSoil = fineSoil;
    }

    public String getDroughtTolerance() {
        return droughtTolerance;
    }

    public void setDroughtTolerance(String droughtTolerance) {
        this.droughtTolerance = droughtTolerance;
    }

    public String getMoistureUse() {
        return moistureUse;
    }

    public void setMoistureUse(String moistureUse) {
        this.moistureUse = moistureUse;
    }

    public String getMinimumPrecipitation() {
        return minimumPrecipitation;
    }

    public void setMinimumPrecipitation(String minimumPrecipitation) {
        this.minimumPrecipitation = minimumPrecipitation;
    }

    public String getMaximumPrecipitation() {
        return maximumPrecipitation;
    }

    public void setMaximumPrecipitation(String maximumPrecipitation) {
        this.maximumPrecipitation = maximumPrecipitation;
    }

    public String getMinimumRootDepth() {
        return minimumRootDepth;
    }

    public void setMinimumRootDepth(String minimumRootDepth) {
        this.minimumRootDepth = minimumRootDepth;
    }

    public String getShadeTolerance() {
        return shadeTolerance;
    }

    public void setShadeTolerance(String shadeTolerance) {
        this.shadeTolerance = shadeTolerance;
    }

    public String getBloomPeriod() {
        return bloomPeriod;
    }

    public void setBloomPeriod(String bloomPeriod) {
        this.bloomPeriod = bloomPeriod;
    }

    public String getFruitSeedAbundance() {
        return fruitSeedAbundance;
    }

    public void setFruitSeedAbundance(String fruitSeedAbundance) {
        this.fruitSeedAbundance = fruitSeedAbundance;
    }

    public String getFruitNutPeriodBegin() {
        return fruitNutPeriodBegin;
    }

    public void setFruitNutPeriodBegin(String fruitNutPeriodBegin) {
        this.fruitNutPeriodBegin = fruitNutPeriodBegin;
    }

    public String getFruitNutPeriodEnd() {
        return fruitNutPeriodEnd;
    }

    public void setFruitNutPeriodEnd(String fruitNutPeriodEnd) {
        this.fruitNutPeriodEnd = fruitNutPeriodEnd;
    }

    public String getFruitSeedPersistence() {
        return fruitSeedPersistence;
    }

    public void setFruitSeedPersistence(String fruitSeedPersistence) {
        this.fruitSeedPersistence = fruitSeedPersistence;
    }

    public String getBerryNutSeedProduct() {
        return berryNutSeedProduct;
    }

    public void setBerryNutSeedProduct(String berryNutSeedProduct) {
        this.berryNutSeedProduct = berryNutSeedProduct;
    }

    public String getFodder_product() {
        return fodderProduct;
    }

    public void setFodder_product(String fodder_product) {
        this.fodderProduct = fodder_product;
    }

    public String getPalatableHuman() {
        return palatableHuman;
    }

    public void setPalatableHuman(String palatableHuman) {
        this.palatableHuman = palatableHuman;
    }

}
