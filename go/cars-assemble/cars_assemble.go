package cars

// CalculateWorkingCarsPerHour calculates how many working cars are
// produced by the assembly line every hour.
func CalculateWorkingCarsPerHour(productionRate int, successRate float64) float64 {
	//panic("CalculateWorkingCarsPerHour not implemented")
	var productionRatee = (float64)(productionRate)
	var result = (float64)(productionRatee * (successRate / 100))
	return result
}

// CalculateWorkingCarsPerMinute calculates how many working cars are
// produced by the assembly line every minute.
func CalculateWorkingCarsPerMinute(productionRate int, successRate float64) int {
	//panic("CalculateWorkingCarsPerMinute not implemented")
	var preResult = CalculateWorkingCarsPerHour(productionRate, successRate)
	var result = (int)(preResult / 60)
	return result
}

// CalculateCost works out the cost of producing the given number of cars.
func CalculateCost(carsCount int) uint {
	//panic("CalculateCost not implemented")
	var group = carsCount / 10
	var rest = carsCount % 10

	var result = (uint)((group * 95000) + (rest * 10000))

	return result

}
