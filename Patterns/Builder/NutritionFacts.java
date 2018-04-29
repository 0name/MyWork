package Patterns.Builder;


public class NutritionFacts {
    private final int servings; // обязательный атрибут

    private final int calories; // два дополнительных атрибута
    private final int fat;

    public static class Builder {
        private final int servings;

        private int calories = 0;
        private int fat = 0;

        public Builder(int servings) {
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder){
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
    }

    public static void main(String[] args) {
        NutritionFacts beaf = new NutritionFacts
                .Builder(10)
                .calories(898)
                .fat(45)
                .build();

        NutritionFacts cocacola = new NutritionFacts
                .Builder(10)
                .calories(898)
                .fat(45)
                .build();

    }
}
