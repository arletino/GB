# -*- coding: utf-8 -*-
"""Копия блокнота "HW_09.ipynb"

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/13m7C9H9hFFDSzeJ1rAqYsFCa0AsHTgb2

Задача 40: Работать с файлом california_housing_train.csv, который находится в папке sample_data. Определить среднюю стоимость дома, где кол-во людей от 0 до 500 (population).

Задача 42: Узнать какая максимальная households в зоне минимального значения population.
"""

import pandas as pd

data = pd.read_csv('/content/sample_data/california_housing_train.csv')

data.head()

"""Определить среднюю стоимость дома, где кол-во людей от 0 до 500 (population)"""

data.tail()

mean_value = data['median_house_value'][data['population'] < 500].mean().round(2)
mean_value

"""Задача 42: Узнать какая максимальная households в зоне минимального значения population."""

data[data['households'] == 4.0]

data['population'].min()

data[data['population'] == 3]

households_max = data['households'][data['population'].min() == data['population']].max()
households_max