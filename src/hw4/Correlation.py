import math

def mean(data):
    return sum(data) / len(data)

def covariance(data1, data2):
    mean1 = mean(data1)
    mean2 = mean(data2)
    return sum((x - mean1) * (y - mean2) for x, y in zip(data1, data2)) / len(data1)

def correlation(data1, data2):
    cov = covariance(data1, data2)
    std_dev1 = math.sqrt(covariance(data1, data1))
    std_dev2 = math.sqrt(covariance(data2, data2))
    return cov / (std_dev1 * std_dev2)

# Пример использования
array1 = [1, 2, 3, 4, 5]
array2 = [5, 4, 3, 2, 1]

corr = correlation(array1, array2)
print("Корреляция Пирсона:", corr)